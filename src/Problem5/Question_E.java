//If user enters two command line arguments, divide first argument by second argument.
//If second argument is zero than proper exception should be handled
package Problem5;


public class Question_E {

     public static void main(String args[]) {
       String arg[]={"100","0"};
        if (arg.length != 2) {
            System.out.println("Please provide exactly two command line arguments");
            return;
        }

        try {
            int dividend = Integer.parseInt(arg[0]);
            int divisor = Integer.parseInt(arg[1]);

            // Check if divisor is zero
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }

            int result = dividend / divisor;
            System.out.println("Result of division: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integer arguments.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
    }
}
