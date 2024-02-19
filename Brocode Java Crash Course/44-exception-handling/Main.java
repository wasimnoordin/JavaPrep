import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // exception = events that occur during the execution of a program that
        //             disrupt the normal flow of instructions

        // put try around dangerous code to catch an exception

        try {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide by: ");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("result: " + z);

        }

        // catch is executed if the exception is triggered
        // in this case if we divide by 0

        catch(ArithmeticException e) {
            System.out.println("You can't divide by 0! IDIOT!");

        }

        // what is someone doesn't enter a number?

        catch(InputMismatchException e) {
            System.out.println("PLEASE ENTER A NUMBER OMFG!!!");
        }

        // catch block that will catch all exceptions (this is lazy/bad practice)

        catch(Exception e) {
            System.out.println("Something when wrong");
        }

        // finally block will always exceute whether or not we catch an exception

        finally {
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
