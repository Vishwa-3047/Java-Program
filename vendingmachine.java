import java.util.*;
class vendingMachine
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CCD!");
        System.out.println("Main Menu:");
        System.out.println("c - Coffee");
        System.out.println("t - Tea");
        System.out.println("s - Soups");
        System.out.println("b - Beverages");
        System.out.println("Enter the first letter to select main menu: ");
        char mainMenuChoice = sc.next().charAt(0);
        String subMenu = "";
        switch (mainMenuChoice)
        {
            case 'c':
                System.out.println("Coffee Menu:");
                System.out.println("1 - Espresso Coffee");
                System.out.println("2 - Cappuccino Coffee");
                System.out.println("3 - Latte Coffee");
                break;

            case 't':
                System.out.println("Tea Menu:");
                System.out.println("1 - Plain Tea");
                System.out.println("2 - Assam Tea");
                System.out.println("3 - Ginger Tea");
                System.out.println("4 - Cardamom Tea");
                System.out.println("5 - Masala Tea");
                System.out.println("6 - Lemon Tea");
                System.out.println("7 - Green Tea");
                System.out.println("8 - Organic Darjeeling Tea");
                break;

            case 's':
                System.out.println("Soup Menu:");
                System.out.println("1 - Hot and Sour Soup");
                System.out.println("2 - Veg Corn Soup");
                System.out.println("3 - Tomato Soup");
                System.out.println("4 - Spicy Tomato Soup");
                break;

            case 'b':
                System.out.println("Beverage Menu:");
                System.out.println("1 - Hot Chocolate Drink");
                System.out.println("2 - Badam Drink");
                System.out.println("3 - Badam-Pista Drink");
                break;

            default:
                System.out.println("INVALID OUTPUT!");
                sc.close();
                return;
        }

        System.out.print("Enter the sub menu choice: ");
        int subMenuChoice = sc.nextInt();
        switch (mainMenuChoice)
        {
            case 'c':
                switch (subMenuChoice)
                {
                    case 1:
                        subMenu = "Espresso Coffee";
                        break;
                    case 2:
                        subMenu = "Cappuccino Coffee";
                        break;
                    case 3:
                        subMenu = "Latte Coffee";
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        sc.close();
                        return;
                }
                break;

            case 't':
                switch (subMenuChoice)
                {
                    case 1:
                        subMenu = "Plain Tea";
                        break;
                    case 2:
                        subMenu = "Assam Tea";
                        break;
                    case 3:
                        subMenu = "Ginger Tea";
                        break;
                    case 4:
                        subMenu = "Cardamom Tea";
                        break;
                    case 5:
                        subMenu = "Masala Tea";
                        break;
                    case 6:
                        subMenu = "Lemon Tea";
                        break;
                    case 7:
                        subMenu = "Green Tea";
                        break;
                    case 8:
                        subMenu = "Organic Darjeeling Tea";
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        sc.close();
                        return;
                }
                break;

            case 's':
                switch (subMenuChoice)
                {
                    case 1:
                        subMenu = "Hot and Sour Soup";
                        break;
                    case 2:
                        subMenu = "Veg Corn Soup";
                        break;
                    case 3:
                        subMenu = "Tomato Soup";
                        break;
                    case 4:
                        subMenu = "Spicy Tomato Soup";
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        sc.close();
                        return;
                }
                break;

            case 'b':
                switch (subMenuChoice)
                {
                    case 1:
                        subMenu = "Hot Chocolate Drink";
                        break;
                    case 2:
                        subMenu = "Badam Drink";
                        break;
                    case 3:
                        subMenu = "Badam-Pista Drink";
                        break;
                    default:
                        System.out.println("INVALID OUTPUT!");
                        sc.close();
                        return;
                }
                break;
        }
        System.out.println("Welcome to CCD!");
        System.out.println("Enjoy your " + subMenu + "!");
        sc.close();
    }
}
