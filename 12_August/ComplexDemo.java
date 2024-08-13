import java.util.Scanner;

class Complex {
    private double real, image;

    public Complex() {
        real = image = 0;
    }

    public Complex(double real, double image) {
        this.real = real;
        this.image = image;
    }

    public double getReal() {
        return real;
    }

    public double getimage() {
        return image;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setimage(double image) {
        this.image = image;
    }

    public String toString() {
        return real + " + " + image + "i";
    }

    public Complex add(Complex c) {
        return new Complex(real + c.real, image + c.image);
    }

    public Complex subtract(Complex c) {
        return new Complex(real - c.real, image - c.image);
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex();
        Complex c2 = new Complex(4, 5);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.subtract(c2));
        System.out.println(c2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of c1: ");
        c1.setReal(sc.nextDouble());
        System.out.print("Enter imageinary part of c1: ");
        c1.setimage(sc.nextDouble());
        System.out.println("Real part of c1 = " + c1.getReal());
        System.out.println("imageinary part of c1 = " + c1.getimage());
        System.out.println(c1);
        sc.close();
    }
}

