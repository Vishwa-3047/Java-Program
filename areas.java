import java.util.*;
class rect
{
    void display1()
    {
        int l,b,area;
        Scanner x= new Scanner(System.in);
        l=x.nextInt();
        b=x.nextInt();
        area=l*b;
        System.out.println("rectangle:"+area);
    }
}
class triangle
{
    void display2()
    {
        int a,b,area1;
        Scanner y= new Scanner(System.in);
        a=y.nextInt();
        b=y.nextInt();
        area1=(a*b)/2;
        System.out.println("triangle:"+area1);
    }
}
class circle
{
    void display3()
    {
        double pi=3.14,r,area2;
        Scanner z= new Scanner(System.in);
        r=z.nextFloat();
        area2=pi*r*r;
        System.out.println("circle:"+area2);
    }
}
class areas
{
    public static void main(String args[])
    {
        rect x=new rect();
        x.display1();
        triangle y=new triangle();
        y.display2();
        circle z=new circle();
        z.display3();
    }
}