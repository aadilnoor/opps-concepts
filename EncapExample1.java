class Employee
{
    // For encapsulation all variables should be private
    private String name;
    private int empId;
    private String department;
    private int age;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
public class EncapExample1
{
    public static void main(String args[])
    {
        Employee emp1 = new Employee();
        emp1.setName("Sameer");
        emp1.setEmpId(101);
        emp1.setAge(19);
        emp1.setDepartment("IT");
        
        Employee emp2 = new Employee();
        emp2.setName("ilyas");
        emp2.setEmpId(105);
        emp2.setAge(22);
        emp2.setDepartment("IT");
        
        System.out.println("Name : "+emp1.getName() + ", Age : "+emp1.getAge() + ",  EmpId : "+emp1.getEmpId() + ", Department : "+emp1.getDepartment());

        System.out.println("-----------------------------------------------------------------------");
        
        System.out.println("Name : "+emp2.getName() + ", Age : "+emp2.getAge() + ",  EmpId : "+emp2.getEmpId() + ", Department : "+emp2.getDepartment());
    } 
}