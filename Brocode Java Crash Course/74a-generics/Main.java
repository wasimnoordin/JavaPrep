public class Main {
    public static void main(String[] args) {

        // generics = enable types (classes and interfaces) to be parameters when
        // defining:
        // classes, interfaces, methods
        // a benefit is to eliminate the need to create multiple versions
        // of methods or classes for various data types.
        // Use 1 version for all reference data types

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
        String[] stringArray = { "B", "Y", "E" };

        System.out.println("Method 1: ");
        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(charArray);
        displayArray(stringArray);

        System.out.println("Method 2: ");
        System.out.println(getFirstElement(intArray));
        System.out.println(getFirstElement(doubleArray));
        System.out.println(getFirstElement(charArray));
        System.out.println(getFirstElement(stringArray));

    }

    // angle brackets and Thing for generic methods
    // this is more efficient than writing 4 methods for seperate data types
    // Method 1

    public static <Thing> void displayArray(Thing[] array) {
        for (Thing x: array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    // now lets create a generic method that return something generic
    // Method 2
    public static <Thing> Thing getFirstElement(Thing[] array) {
       return array[0];
    }

}
