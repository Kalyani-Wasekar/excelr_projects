package Java_Assignment;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }
}

public class que_1_method_overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Calling add method with two integers
        System.out.println("Addition of two integers: " + calc.add(5, 10));

        // Calling add method with three integers
        System.out.println("Addition of three integers: " + calc.add(5, 10, 15));

        // Calling add method with two double values
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.5));
    }
}



