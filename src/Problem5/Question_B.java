//Write a program in Java to demonstrate multiple try block and multiple catch exception
package Problem5;


public class Question_B {
   public static void main(String[] args) {
        try {
            // First try block
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);  // This will cause an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception: " + e.getMessage());
        }
        
        try {
            // Second try block
            int result = 10 / 0;  // This will cause an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
        }
        
        try {
            // Third try block
            String str = null;
            System.out.println(str.length());  // This will cause a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception: " + e.getMessage());
        }
        
        System.out.println("Program continues after exceptions");
    }   
}
