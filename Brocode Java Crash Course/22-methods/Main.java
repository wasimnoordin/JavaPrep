public class Main {
    public static void main(String[] args) {
        
        // method = block of code that is executed whenever it is called upon
        
        // lets pass an argument to a method
        String name = "Sim";
        int age = 21;
        hello(name, age);

        // another example, lets sum these two
        int x = 3;
        int y = 4;
        int z = add(x, y); // local variable z, storing the add in z
        
        System.out.println(z);
        System.out.println(add(x, y)); // alternative without storing
    }

    // must be static as main method is static
    // need to ensure what we pass to a method agrees with its parameters
    // for parameter include data types and name of the parameter

    static void hello(String title, int age) {
        System.out.println("Hello " + title);
        System.out.println("You are " + age);
    }

    // void is the return type, since we want an int, change it
    static int add(int x, int y) {
        int z = x + y;
        return z;

    }
    
}
