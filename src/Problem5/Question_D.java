//If user enters only one command line argument than inner try block should throw an Exception
package Problem5;

public class Question_D extends Exception {
    public static void main(String[] args) {
        try {
            if (args.length == 2) {
                throw new Exception("Please provide exactly two command line arguments");
            }

            // Outer try block
            int[] arr = {1, 2, 3};
            System.out.println("Outer try block");

            try {
                // Inner try block
                int result = arr[5];  // This will cause an ArrayIndexOutOfBoundsException
                System.out.println("Inner try block - Result: " + result);
            } catch (Exception e) {
                System.out.println("Inner catch block - Array Index Out Of Bounds Exception: " + e.getMessage());
            }

            int zero = 0;
            try {
                // Nested inner try block
                int divisionResult = 10 / zero;  // This will cause an ArithmeticException
                System.out.println("Nested inner try block - Division Result: " + divisionResult);
            } catch (ArithmeticException e) {
                System.out.println("Nested inner catch block - Arithmetic Exception: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Outer catch block - Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exceptions");
    }
}
