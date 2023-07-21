import java.util.*;

class Ebill {
    public static void main(String[] args) {
        CustomerData ob = new CustomerData();
        ob.getData();
        ob.calculate();
        ob.display();
    }
}

class CustomerData {
    private Scanner input = new Scanner(System.in);
    private String customerName;
    private int customerNumber;
    private String connectionType;
    private double currentReading;
    private double previousReading;
    private double totalUnits;
    private double totalBill;

    void getData() {
        System.out.print("Enter consumer number: ");
        customerNumber = input.nextInt();
        System.out.print("Enter type of connection (D for Domestic or C for Commercial): ");
        connectionType = input.next();
        System.out.print("Enter consumer name: ");
        input.nextLine();
        customerName = input.nextLine();
        System.out.print("Enter previous month reading: ");
        previousReading = input.nextDouble();
        System.out.print("Enter current month reading: ");
        currentReading = input.nextDouble();
    }

    void calculate() {
        totalUnits = currentReading - previousReading;
        if (connectionType.equals("D")) {
            if (totalUnits <= 100) {
                totalBill = 1 * totalUnits;
            } else if (totalUnits > 100 && totalUnits <= 200) {
                totalBill = 2.50 * totalUnits;
            } else if (totalUnits > 200 && totalUnits <= 500) {
                totalBill = 4 * totalUnits;
            } else {
                totalBill = 6 * totalUnits;
            }
        } else {
            if (totalUnits <= 100) {
                totalBill = 2 * totalUnits;
            } else if (totalUnits > 100 && totalUnits <= 200) {
                totalBill = 4.50 * totalUnits;
            } else if (totalUnits > 200 && totalUnits <= 500) {
                totalBill = 6 * totalUnits;
            } else {
                totalBill = 7 * totalUnits;
            }
        }
    }

    void display() {
        System.out.println("Consumer number: " + customerNumber);
        System.out.println("Consumer name: " + customerName);
        System.out.println("Type of connection: " + (connectionType.equals("D") ? "DOMESTIC" : "COMMERCIAL"));
        System.out.println("Current month reading: " + currentReading);
        System.out.println("Previous month reading: " + previousReading);
        System.out.println("Total units: " + totalUnits);
        System.out.println("Total bill: RS " + totalBill);
    }
}
