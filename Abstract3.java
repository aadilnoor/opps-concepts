abstract class Course 
{
    public void courseDetail()
    {
        System.out.println("Course name: BCA");
        System.out.println("Course Duration : 2023 - 2024");
        System.out.println("-----------------------------------");
    }
    
    public abstract void studentData();
}


class Student
{
    int rollNo;
    String name;
    String className;
    
    public Student(int rollNo, String name, String className) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.className = className;
    }
    public int getRollNo()
     {
        return rollNo;
    }
    public void setRollNo(int rollNo) 
    {
        this.rollNo = rollNo;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public String getClassName() 
    {
        return className;
    }
    public void setClassName(String className) 
    {
        this.className = className;
    }
}

class StudentRecord1 extends Course
{

    @Override
    public void studentData() 
    {
        Student student = new Student(1, "Sameer", "BCA");
        
        System.out.println("RollNo: "+student.getRollNo());
        System.out.println("Name: "+student.getName());
        System.out.println("Class Name: "+student.getClassName());
        System.out.println("-----------------------------------");
    }
}

class StudentRecord2 extends Course
{

    @Override
    public void studentData() 
    {
        Student student = new Student(2, "Ilyas", "BCA");
        
        System.out.println("RollNo: "+student.getRollNo());
        System.out.println("Name: "+student.getName());
        System.out.println("Class Name: "+student.getClassName());
    }
}

public class Abstract3
{
    public static void main(String arg[])
    {
        StudentRecord1 obj = new StudentRecord1();
        obj.courseDetail();
        obj.studentData();
        
        StudentRecord2 obj1 = new StudentRecord2();
        obj1.studentData();
    }
}