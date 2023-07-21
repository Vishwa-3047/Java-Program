import java.util.Scanner;
class Number {
    int num;
    void getnum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        num = sc.nextInt();
    }
}
class spynumber extends Number {
     void spy()
    {
        int sum = 0;
        int product = 1;
        int temp = num;
        while(temp > 0)
        {
            int rem = temp % 10;
            sum += rem;
            product *= rem;
            temp /= 10;
        }
        if(sum == product) {
            System.out.println("it is spy number");
        } else {
            System.out.println(" it is not a py number.");
        }
    }
}

public class spynum{
    public static void main(String[] args)
    {
        spynumber spy = new spynumber();
        spy.getnum();
        spy.spy();
    }
}
