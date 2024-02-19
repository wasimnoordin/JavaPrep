import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x = 3.14;
        double y = -10;

        // find larger of 2 numbers
        double big = Math.max(x, y);
        System.out.println(big);

        // find smaller of 2 numbers
        double smol = Math.min(x, y);
        System.out.println(smol);

        // find absolute value
        double absolute = Math.abs(y);
        System.out.println(absolute);

        // find square root
        double sr = Math.sqrt(x);
        System.out.println(sr);

        // round a value
        double round = Math.round(3.14);
        System.out.println(round);

        // always round up
        double ceiling = Math.ceil(x);
        System.out.println(ceiling);

        // always round down
        double floor = Math.floor(x);
        System.out.println(floor);

        // create a program to find hypotenuse of a triangle
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The hypotenuse is: " + c);

        scanner.close();

    }

}
