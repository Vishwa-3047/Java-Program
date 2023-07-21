class Member
{
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    public void printSalary()
    {
        System.out.println("Salary: " + salary);
    }
}
class Employee extends Member
{
    String specialization;
    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }
}
class Manager extends Member
{
    String department;
    public Manager(String name, int age, String phoneNumber, String address, double salary, String department)
    {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }
}

public class datamembers
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("Vijay", 49,"1111111111", "Tiruppur", 50000,"Java");
        Manager manager1 = new Manager("Ajith", 35,"0000000000", "Kottayam", 100000,"HR");

        System.out.println("Employee Details:");
        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Phone Number: " + employee1.phoneNumber);
        System.out.println("Address: " + employee1.address);
        System.out.println("Salary: " + employee1.salary);
        System.out.println("Specialization: " + employee1.specialization);

        System.out.println("\nManager Details:");
        System.out.println("Name: " + manager1.name);
        System.out.println("Age: " + manager1.age);
        System.out.println("Phone Number: " + manager1.phoneNumber);
        System.out.println("Address: " + manager1.address);
        System.out.println("Salary: " + manager1.salary);
        System.out.println("Department: " + manager1.department);

}
}
