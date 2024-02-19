import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // while loop = executes block of code as long as its condition remains true

        Scanner scanner = new Scanner(System.in);
        String name = "";

        while(name.isBlank()) {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

        // a do loop is similar to while, but it always exectues block of code once
        int age;
        do {
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age <= 0);

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");

        scanner.close();
    }
}
