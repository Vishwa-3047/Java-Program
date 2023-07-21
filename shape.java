import java.util.*;
class rectangle
{
    int len,bre;
    void rect(int l,int b)
    {
        len=l;
        bre=b;
        System.out.println("the area of rectangle is : "+(len*bre));
    }
}
class cir
{
    int ra;
    void circle(int r)
    {
        ra=r;
        System.out.println("the area of circle is : "+(float)(2*ra*3.14));
    }
}
class sq
{
    int ar;
    void square(int a)
    {
        ar=a;
        System.out.println("the area of square is: "+a*a);
    }
}
class shape
{
    public static void main(String[]args)
    {
        Scanner my =new Scanner(System.in);
        int l =my.nextInt();
        int b=my.nextInt();
        int r=my.nextInt();
        int a=my.nextInt();
        rectangle rs= new rectangle();
        cir c= new cir();
        sq s=new sq();
        rs.rect(l,b);
        c.circle(r);
        s.square(a);
    }
}