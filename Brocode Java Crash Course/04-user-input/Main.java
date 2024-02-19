import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner accepts user input, found in java.util
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = scanner.nextLine();

        System.out.println("How old are you? ");
        int age = scanner.nextInt(); 
        scanner.nextLine(); // after call next int, call next line to clear \n in scanner

        System.out.println("What is your favourite food? ");
        String food = scanner.nextLine();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your favourite food is " + food);
        
        scanner.close();
    }
}
