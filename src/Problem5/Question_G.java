//rite a program to handle InterruptedException, IllegalArgumentException using try-catfinally and throw
package Problem5;

public class Question_G {
    public static void main(String[] args) {
        try {
            // Simulating InterruptedException
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after InterruptedException");
        }

        try {
            int value = -5;
            if (value < 0) {
                throw new IllegalArgumentException("Value cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed after IllegalArgumentException");
        }
    }
}

