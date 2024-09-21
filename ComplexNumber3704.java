import java.util.*;
public class ComplexNumber3704 {
        private double real;
        private double imaginary;

        public ComplexNumber3704(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }
        public ComplexNumber3704 add(ComplexNumber3704 other) {
            double newReal = this.real + other.real;
            double newImaginary = this.imaginary + other.imaginary;
            return new ComplexNumber3704(newReal, newImaginary);
        }

        public ComplexNumber3704 subtract(ComplexNumber3704 other) {
            double newReal = this.real - other.real;
            double newImaginary = this.imaginary - other.imaginary;
            return new ComplexNumber3704(newReal, newImaginary);
        }
        public ComplexNumber3704 multiply(ComplexNumber3704 other) {
            double newReal = this.real * other.real - this.imaginary * other.imaginary;
            double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
            return new ComplexNumber3704(newReal, newImaginary);
        }
        public ComplexNumber3704 divide(ComplexNumber3704 other) {
            double divisor = other.real * other.real + other.imaginary * other.imaginary;
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            double newReal = (this.real * other.real + this.imaginary * other.imaginary) / divisor;
            double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / divisor;
            return new ComplexNumber3704(newReal, newImaginary);
        }
        @Override
        public String toString() {
            if (imaginary >= 0) {
                return String.format("%s + %si", real, imaginary);
            } else {
                return String.format("%s - %si", real, -imaginary);
            }
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            ComplexNumber3704 that = (ComplexNumber3704) obj;
            return Double.compare(that.real, real) == 0 &&
                    Double.compare(that.imaginary, imaginary) == 0;
        }

        public static void main(String[] args) {
            System.out.println("Monisha P J - 2022503704");
            ComplexNumber3704 c1 = new ComplexNumber3704(3, 4);
            ComplexNumber3704 c2 = new ComplexNumber3704(1, -2);
            System.out.println("c1: " + c1);
            System.out.println("c2: " + c2);
            ComplexNumber3704 sum = c1.add(c2);
            ComplexNumber3704 difference = c1.subtract(c2);
            ComplexNumber3704 product = c1.multiply(c2);
            ComplexNumber3704 quotient = c1.divide(c2);
            boolean isEqual = c1.equals(c2);
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("c1 equals c2: " + isEqual);
        }
}
