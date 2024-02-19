public class Main {

    public static void main(String[] args) {

        int x; //decalarion
        
        x = 123; //assignment

        int y = 124; //initialisation

        System.out.println(x);
        System.out.println("The value of y is:" + y);
        
        long l = 1234567890123456L; //put an L at the end of a long variable
        byte by = 120; //up to 127
        float f = 3.14f; //need f after float
        double d = 3.14; //more precision that float, don't need f
        boolean bo = false; //1 = true, 0 = false
        char symbol = '@'; //single quotes
        
        String str = "Sim"; //double quotes, capitalise String as it is a ref data type
        System.out.println("Hello" + str);
    }
}
