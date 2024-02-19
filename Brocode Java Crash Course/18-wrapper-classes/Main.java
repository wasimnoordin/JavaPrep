public class Main {
    public static void main(String[] args) {
        // wrapper class = provides a wat to use primitive data types as reference data types
        // reference data types contain useful methods
        // can be used with collections (ex. ArrayList)

        // primitive    // wrapper
        // ----------   // ----------
        // boolean      // Boolean
        // char         // Character
        // int          // Integer
        // double       // Double

        // autoboxing = automatic conversion that Java Compuler makes between primitive to wrapper class
        // unboxing = reverse of autoboxing. Automatic conversion of wrapper class to primitive

        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Sim";

        if (a == true && b == '@'){
            System.out.println("This is true");
        } 
    }
}
