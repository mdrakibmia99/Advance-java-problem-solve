//Write a program in Java to develop user defined exception for 'Divide by Zero' error
package Problem5;

// Custom exception class for DivideByZeroError
class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}

// Calculator class that throws DivideByZeroException
class Calculator {
    int divide(int numerator, int denominator) throws DivideByZeroException {
        if (denominator == 0) {
            throw new DivideByZeroException("Division by zero is not allowed");
        }
        return numerator / denominator;
    }
}
public class Question_A {
   public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int numerator = 10;
        int denominator = 0;

        try {
            int result = calculator.divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    } 
}
