/*CREATING DATABASE*/
CREATE DATABASE Students

/*USING DATABASE*/
USE Students


/*CREATING TABLES FOR THE DATABASE*/

-- Student table
CREATE TABLE Student (
    SID INT PRIMARY KEY,
    SName VARCHAR(50) NOT NULL
);

-- Course table
CREATE TABLE Course (
    CID INT PRIMARY KEY,
    CName VARCHAR(50) NOT NULL
);

-- Course_Section table
CREATE TABLE Course_Section (
    CID INT,
    SecID INT,
    SType VARCHAR(10),
    PRIMARY KEY (CID, SecID),
    FOREIGN KEY (CID) REFERENCES Course(CID)
);

-- Std_Enrolled_Sec table
CREATE TABLE Std_Enrolled_Sec (
    SID INT,
    CID INT,
    SecID INT,
    Grade VARCHAR(2),
    PRIMARY KEY (SID, CID, SecID),
    FOREIGN KEY (SID) REFERENCES Student(SID),
    FOREIGN KEY (CID, SecID) REFERENCES Course_Section(CID, SecID)
);

/*INSERTIUNG VALUES FOR THE DATABASE*/

INSERT INTO Student (SID, SName)
VALUES
(1003, 'Eshaan Barry'),
(1000, 'Saeed Mirjalili'),
(1005, 'Jack Lei'),
(1001, 'Iris Chang'),
(1002, 'Jocelyn Bowes'),
(1004, 'Jagmeet Singh'),
(1006, 'Rodrigo Ferrara');


INSERT INTO Course (CID, CName)
VALUES
(1480, 'Networking'),
(2221, 'Database Systems'),
(1045, 'Web Programming'),
(1050, 'Intro to Computers'),
(1030, 'Web Development'),
(1280, 'Linux Systems');


INSERT INTO Course_Section (CID, SecID, SType)
VALUES
(1030, 1, 'Reg'),
(1030, 2, 'Reg'),
(1045, 1, 'WWW'),
(1045, 2, 'WWW'),
(1045, 3, 'WWW'),
(1045, 4, 'WWW'),
(1045, 5, 'Reg'),
(1050, 1, 'WWW'),
(1280, 1, 'WWW'),
(1280, 2, 'Reg'),
(1480, 1, 'WWW'),
(1480, 2, 'WWW'),
(1480, 3, 'WWW');


INSERT INTO Std_Enrolled_Sec (SID, CID, SecID, Grade)
VALUES
(1002, 1045, 2, 0),
(1000, 1045, 1, 0),
(1002, 1045, 1, 70),
(1000, 1030, 1, 95),
(1000, 1480, 3, 97),
(1000, 1480, 2, 75),
(1000, 1050, 1, 98),
(1002, 1050, 1, 90),
(1002, 1280, 2, 45),
(1002, 1480, 3, 72),
(1003, 1045, 4, 65),
(1003, 1480, 3, 79),
(1001, 1030, 1, 75),
(1001, 1280, 2, 40),
(1000, 1045, 2, 0),
(1000, 1045, 3, 90),
(1000, 1045, 4, 90),
(1000, 1045, 5, 95),
(1000, 1030, 2, 95),
(1000, 1480, 1, 99),
(1000, 1280, 1, 75),
(1001, 1045, 3, 75),
(1000, 1280, 2, 100);


/*QUERIES FOR THE JOINS EXAMPLE.pdf DATABASE*/

--Q1: Display the name of students who enrolled in at least one section.
SELECT DISTINCT S.SName, S.SID
FROM Student S
RIGHT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID;

--Q2: Retrieve Course ID, section ID, and Section Type of the sections that have been enrolled by at least one student
SELECT DISTINCT CS.CID, CS.SecID, CS.SType
FROM Course_Section CS
RIGHT JOIN  Std_Enrolled_Sec ST ON (CS.CID = ST.CID AND CS.SecID = ST.SecID)
ORDER BY CS.CID

-- Q2: more explained
SELECT DISTINCT CS.CID, CS.SecID, CS.SType, COUNT(ST.CID) AS [Number of students enrolled]
FROM Course_Section CS
RIGHT JOIN  Std_Enrolled_Sec ST ON (CS.CID = ST.CID AND CS.SecID = ST.SecID)
GROUP BY CS.CID, CS.SecID, CS.SType
ORDER BY CS.CID;

--Q3: Display CID, SecID, and SType of all sections 
--(no matter if a student has enrolled in that section or not) 
--and the name of students who enrolled in that section.
SELECT DISTINCT CS.CID, CS.SecID, CS.SType, S.SName
FROM Course_Section CS
JOIN Std_Enrolled_Sec ST ON CS.CID = ST.CID AND CS.SecID = ST.SecID
JOIN Student S ON ST.SID = S.SID
ORDER BY CS.CID, CS.SecID;

--Q4: Display the name of all students (no matter if they have enrolled in any section) 
--and the section number of all sections that they have enrolled.
SELECT DISTINCT S.SName, ST.SecID
FROM Student S
LEFT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
ORDER BY S.SName DESC;

--Q5: Display the name of all students and all sections they have enrolled 
--(no matter if a student has enrolled in any section and no matter if a section was enrolled by any student)
SELECT *
FROM (Student S LEFT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID)
FULL JOIN Course_Section CS ON (ST.SecID = CS.SecID AND ST.CID = CS.CID)
ORDER BY S.SName DESC;

--Q6: Display the name of student who have not enrolled in any section?
SELECT S.SID, S.SName, ST.SID AS SID, ST.CID, ST.SecID, ST.Grade
FROM Student AS S 
LEFT OUTER JOIN Std_Enrolled_Sec AS ST ON S.SID = ST.SID 
FULL OUTER JOIN Course_Section AS CS ON ST.SecID = CS.SecID AND ST.CID = CS.CID
WHERE  (ST.SID IS NULL)
ORDER BY S.SID ASC;

--Q7: Display the name of section which has not been enrolled by any student?
SELECT DISTINCT *
FROM Course_Section CS
LEFT JOIN Std_Enrolled_Sec ST ON (CS.CID = ST.CID AND CS.SecID = ST.CID)
WHERE ST.SID IS NULL
ORDER BY CS.SecID DESC;

--Q8: Retrieve the name of student and number of sections that they have enrolled.
SELECT S.SName, COUNT(ST.CID) AS [Number of Sectiones Enrolled]
FROM Student S
LEFT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
GROUP BY S.SID, S.SName
order by S.SID ASC;

--Q9: Retrieve the name of students who have taken all offered courses
SELECT S.SID, S.SName
FROM Student S JOIN Std_Enrolled_Sec ST ON S.SID=ST.SID
GROUP BY S.SID, S.SName
HAVING COUNT(DISTINCT ST.CID) = (SELECT COUNT(DISTINCT CID)
FROM Course_Section)

--Q10: Retrieve the CID of courses and the number of students who enrolled in those sections.
SELECT CID, SecID, COUNT(SID) AS [Number of Students Enrolled]
FROM Std_Enrolled_Sec AS ST
GROUP BY CID, SecID
ORDER BY CID;

--Q11: retrieve the name of students who are classmates with ‘Saeed Mirjalili’ in all sections that he has enrolled.
SELECT DISTINCT S.SID, S.SName, ST.CID, ST.SecID
FROM Student AS S 
LEFT OUTER JOIN Std_Enrolled_Sec AS ST ON S.SID = ST.SID
WHERE (S.SName != 'Saeed Mirjalili')
AND (ST.SecID IS NOT NULL)
GROUP BY S.SID, S.SName, ST.CID, ST.SecID;

--Q12: Retrieve the name of all students who enrolled in 1045-001.
SELECT S.SID, S.SName 
FROM Student S
INNER JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
WHERE ST.CID = 1045 AND ST.SecID = 1;

/*************************************************************************/
/*************************************************************************/
/*************************************************************************/

/*OTHER QUERIES FOR PRACTICING*/

--IS NOT NULL ojo pal examen!!!
--Create a SQL query to retrieve the Student ID (SID), Student Name (SName)
--and the count of sections each student is enrolled in.
SELECT S.SID, S.SName, COUNT (S.SID) AS [Number of sesions student enrolled]
FROM Student S
LEFT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
WHERE ST.SID IS NOT NULL
GROUP BY S.SID, S.SName
ORDER BY S.SID

--Create a SQL query to retrieve the Student ID (SID), Student Name (SName)
--and the count of sections each student is not enrolled in.
SELECT S.SID, S.SName, COUNT (S.SID) AS [Number of sesions student enrolled]
FROM Student S
LEFT JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
WHERE ST.SID IS NULL
GROUP BY S.SID, S.SName
ORDER BY S.SID

--IS NULL values
--retrieve the name of the course which was/were not enrolled by any student
SELECT *
FROM Course C
LEFT JOIN Std_Enrolled_Sec ST ON c.CID = st.CID
WHERE ST.SID IS NULL;

--inner query, also Nested query or subquery
-- the Lowest Grade
SELECT * 
FROM Std_Enrolled_Sec
WHERE Grade <= ALL (SELECT Grade FROM Std_Enrolled_Sec);

--all fields the database
select s.SID,s.SName, st.CID, st.SecID, st.Grade, c.CName, CS.SType
from Student S
full join Std_Enrolled_Sec ST on s.SID=ST.SID 
full join Course C on st.CID=c.CID
full join Course_Section CS on c.CID=cs.CID
order by s.SID

/*ChatGPT Examples*/

--Find the total number of courses offered in each section type (SType).
SELECT ST.SType, COUNT(ST.CID) as [Total Number of Courses Offered]
FROM Course_Section ST
GROUP BY ST.SType
ORDER BY ST.SType;

--Retrieve the names of students who have enrolled in more than three sections.
SELECT S.SID, S.SName, COUNT(ST.SID) AS [Number of sections student are enrolled]
FROM Student S
JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID
GROUP BY S.SID, S.SName
HAVING COUNT(ST.SID) > 3 --"WHERE" para filtrar por tablas, "HAVING" para filtrar por agregaciones
ORDER BY [Number of sections student are enrolled] ASC;

--List the Course IDs and their corresponding Section IDs for courses with at least two students enrolled.
SELECT ST.CID, ST.SecID, COUNT(ST.SID) AS [Number of sections student are enrolled]
FROM Std_Enrolled_Sec AS ST 
GROUP BY ST.CID, ST.SecID
HAVING (COUNT(ST.SID) >= 2)
ORDER BY [Number of sections student are enrolled] DESC;

-- Find the average grade for each course section.
SELECT ST.SecID, AVG(TRY_CONVERT(NUMERIC, Grade)) AS [Average Grade]
FROM Std_Enrolled_Sec ST
GROUP BY ST.SecID;

--Display the names of students who have enrolled in sections offered in the 'WWW' section type.
SELECT S.SName, CS.SType
FROM Student S
INNER JOIN Std_Enrolled_Sec ST ON S.SID = ST.SID 
INNER JOIN Course_Section CS ON ST.CID = CS.CID
WHERE CS.SType = 'WWW'
GROUP BY S.SName, CS.SType
ORDER BY S.SName, CS.SType DESC;

-- List the names of students who more than 90 grade in each course.
SELECT S.SName, ST.CID, ST.SecID, MAX(ST.Grade) AS [max grade]
FROM Std_Enrolled_Sec AS ST
INNER JOIN Student AS S ON ST.SID = S.SID
GROUP BY S.SName, ST.SID, ST.CID, ST.SecID
HAVING MAX(ST.Grade)>'90'
ORDER BY S.SName


-- List only the name of the student who had the highest grade.
SELECT *
FROM Std_Enrolled_Sec
WHERE Grade = (SELECT MAX(Grade) from Std_Enrolled_Sec)
ORDER BY Grade DESC;


--Find the courses with the highest enrollment count.

--Retrieve the names of students who have enrolled in all sections offered.

--Display the names of students who have enrolled in sections with a grade above the average grade.

--List the Course IDs and Section IDs for sections with no enrolled students and were offered in the 'Reg' section type.

--Find the student(s) with the highest total grade across all sections.



/*"Retrieve the details of students who have a grade greater than or equal to 1 and are enrolled in exactly one distinct course section. Include the student ID, student name, grade, and section ID in the result set, and ensure the results are ordered by student ID, student name, grade, and section ID."*/
SELECT S.SID, S.SName, ST.Grade, st.SecID, c.CID, c.CName, cs.SType, sum(DISTINCT ST.CID) AS [Enrolled in one distinct course section]
FROM Student AS S
INNER JOIN Std_Enrolled_Sec AS ST ON S.SID = ST.SID
INNER JOIN Course AS C ON ST.CID = C.CID
INNER JOIN Course_Section AS CS ON C.CID = CS.CID
WHERE ST.Grade >= '1'
GROUP BY S.SID, S.SName, ST.Grade, st.SecID, c.CID, c.CName, cs.SType
HAVING COUNT(DISTINCT ST.CID) = 1 or COUNT(DISTINCT ST.CID) between 1 and 2
ORDER BY S.SID, S.SName, ST.Grade, st.SecID, c.CID, c.CName, cs.SType;





/*************************************************************************/
/*************************************************************************/
/*************************************************************************/

--creating views and display agregations
CREATE VIEW medidas2 AS
SELECT
    SUM(ST.SID) AS suma,
    MIN(ST.SID) AS minimo,
    MAX(ST.SID) AS maximo,
    AVG(ST.SID) AS average,
    COUNT(ST.SID) AS conteo
FROM
    Std_Enrolled_Sec ST;

-- Create the stored procedure
CREATE PROCEDURE SelectAllCourses @CID INT AS
SELECT * FROM Course WHERE CID = @CID;

-- Execute the stored procedure
-- 1480 is the actual Course ID you're looking for
EXEC SelectAllCourses @CID = 1480;  


/*Creating Indexes*/

--first run "USE Students" Database
USE Students;

--then create a index
SELECT 
    t.name AS TableName,
    ind.name AS IndexName,
    ind.type_desc AS IndexType
FROM 
    sys.indexes ind
INNER JOIN 
    sys.tables t ON ind.object_id = t.object_id
WHERE 
    t.name = 'Student' AND ind.name = 'IX_Student_SName';