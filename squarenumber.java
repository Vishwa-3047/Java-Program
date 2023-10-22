import java.util.*;
class squarenumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = (long)n * n;
        int a=n,cnt=0;
        while(a>0)
        {
            a = a/10;
            cnt++;
        }
        a=1;
        while(cnt>0)
        {
            a = a*10;
            cnt--;
        }
        if (m % a == n) {
            System.out.println("Correct Number");
        } else {
            System.out.println("Incorrect Number");
        }
    }
}