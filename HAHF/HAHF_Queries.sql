use HAHF;

--Joins (INNER, Left, Right)
UPDATE VIEW HOLAS AS
SELECT TOP 3 aptno AS Apartment, anoofbedrooms AS [Number of bedrooms], ccid AS [Clave]
FROM Apartment
RIGHT JOIN Building ON Apartment.BuildingID = Building.BuildingID
WHERE ccid LIKE '%C%'
ORDER BY ccid DESC;

-- Creating the view
CREATE VIEW Definitive AS
SELECT aptno AS [Apartment #], anoofbedrooms AS [# of Bedrooms], ccid AS [Clave Edificio], bnooffloors AS Banos
FROM Apartment
JOIN Building ON Apartment.BuildingID = Building.BuildingID
WHERE ccid LIKE '%C%' 
	AND ccid IS NOT NULL;

--inner join con varias formulas
select TOP 2 [aptno] AS Edifice, [aptno] AS Flat, [anoofbedrooms] AS [Number of bedrooms], [bnooffloors] AS Floors, [aptno]*[anoofbedrooms] AS Sumarization
from Apartment
INNER JOIN Building ON Apartment.buildingid = Building.buildingid
WHERE [aptno] >= 20
ORDER BY [aptno] DESC;


--full outer join
-- filtering the "NULL values" in two tables
--it works for FULL OUTER JOIN and FULL JOIN 
SELECT *
FROM Apartment
FULL OUTER JOIN Building ON Apartment.BuildingID = Building.BuildingID
WHERE aptno is not null AND ccid is not null
ORDER BY ccid desc;


--JOIN more than two tables 
SELECT TOP 5 *
FROM Apartment
INNER JOIN Building ON Apartment.buildingid = Building.buildingid
RIGHT JOIN Cleaning ON Building.buildingid = Cleaning.buildingid
WHERE ccid IS NOT NULL
ORDER BY smemberid DESC;

















