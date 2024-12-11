import java.util.*;

public class Student {
    private String name;
    private int age;
    private int roll_no;

    public Student(String name, int age, int roll_no) {
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override

    public String toString()
    {
        return "The name of the student is "+this.name+"\n"+
        " The age of the student is "+ this.age+"\n"+" "+"The roll no of the student is "+this.roll_no;
    }

    public static Student createStudent() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'createStudent'");
    }

}

class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getAge() == s2.getAge())
            return 0;
        else if (s1.getAge() < s2.getAge())
            return -1;
        else 
            return 1;
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.getRoll_no() == s2.getRoll_no())
            return 0;
        else if (s1.getRoll_no() < s2.getRoll_no())
            return -1;
        else 
            return 1;
    }
}