import java.util.*;
class cyclinder
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height :");
        double height = sc.nextDouble();
        System.out.println("Enter the width :");
        double width = sc.nextDouble();
        System.out.println("Enter the thickness :");
        double thickness = sc.nextDouble();
        sc.close();
        if (height <= 0 || width <= 0 || thickness <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        double radius = width / (2 * Math.PI);
        if (radius < 1)
        {
            System.out.println("Invalid Input");
            return;
        }
        double innerRadius = radius - thickness;
        if (innerRadius <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        double volume = Math.PI * innerRadius * innerRadius * height;
        int roundedVolume = (int) Math.ceil(volume);
        System.out.println("The volume of the cylinder is " + roundedVolume);
    }
}
