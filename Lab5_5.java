import java.util.Scanner;
public class Lab5_5{
     double real;
     double imgnry;

    // Default constructor
    public Lab5_5() {
        this.real = 0.0;
        this.imgnry = 0.0;
    }

    // Constructor with real and imaginary parts
    public Lab5_5(double real, double imgnry) {
        this.real = real;
        this.imgnry = imgnry;
    }

    // Copy constructor
    public Lab5_5(Lab5_5 other) {
        this.real = other.real;
        this.imgnry = other.imgnry;
    }

    // Method to add two complex numbers
    public Lab5_5 add(Lab5_5 other) {
        double resultReal = this.real + other.real;
        double resultImgnry = this.imgnry + other.imgnry;
        return new Lab5_5(resultReal, resultImgnry);
    }

    // Getters and setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImgnry() {
        return imgnry;
    }

    public void setimgnry(double imgnry) {
        this.imgnry = imgnry;
    }

    // Method to represent Complex number as a string
    public String toString() {
        if (imgnry >= 0) {
            return real + " + " + imgnry + "i";
        } else {
            return real + " - " + (-imgnry) + "i";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the real part of the first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the first complex number:");
        double imgnry1 = scanner.nextDouble();
        Lab5_5 c1 = new Lab5_5(real1, imgnry1);

        System.out.println("Enter the real part of the second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter the imaginary part of the second complex number:");
        double imgnry2 = scanner.nextDouble();
        Lab5_5 c2 = new Lab5_5(real2, imgnry2);

        Lab5_5 sum = c1.add(c2);
        System.out.println("Sum: " + sum);
    }
}
