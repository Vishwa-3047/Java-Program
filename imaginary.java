import java.util.Scanner;

class complex {
    double real, imag;
    complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public complex add(complex b) {
        return new complex(real + b.real, imag + b.imag);
    }
    public complex subtract(complex b) {
        return new complex(real - b.real, imag - b.imag);
    }

    public complex multiply(complex b) {
        return new complex(real * b.real - imag * b.imag, real * b.imag + imag * b.real);
    }
    public void display() {
        System.out.println(real + "+" + imag + "i");
    }
}

public class imaginary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter:");
        double real1 = sc.nextDouble();
        double imag1 = sc.nextDouble();
        double real2 = sc.nextDouble();
        double imag2 = sc.nextDouble();

        complex c1 = new complex(real1, imag1);
        complex c2 = new complex(real2, imag2);

        System.out.println("Sum:");
        c1.add(c2).display();

        System.out.println("Difference:");
        c1.subtract(c2).display();

        System.out.println("Product:");
        c1.multiply(c2).display();
    }
}
