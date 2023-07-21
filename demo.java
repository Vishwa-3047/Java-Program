import java.util.*;
public class demo
{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        char department= sc.next().charAt(0);
        int age = sc.nextInt();
        long mobileNo = sc.nextLong();
        double cgpa = sc.nextDouble();

        System.out.println("Name: "+name);
        System.out.println("department: "+department);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}
