import java.util.*;
class details {
    void display()
    {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();
        long mobile = sc.nextLong();
        String mailid = sc.next();
        System.out.println("employee id:" + id);
        System.out.println("employee name:" + name);
        System.out.println("employee age:" + age);
        System.out.println("employee mobile:" + mobile);
        System.out.println("employee mailid:" + mailid);
    }
    class emp
        {
            public static void main(String args[])
            {
                details sc=new details();
                sc.display();

            }
        }

}