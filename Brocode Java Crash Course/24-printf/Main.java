public class Main {
    public static void main(String[] args) {

        // printf() = an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        // % is a format specifier
        System.out.printf("This is a format string %d", 123);
        System.out.printf("%d This is a format string", 123);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Sim";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character], b, c, s, d, f
        System.out.printf("%b", myBoolean);
        System.out.printf("%c", myChar);
        System.out.printf("%s", myString);
        System.out.printf("%d", myInt);
        System.out.printf("%f", myDouble);

        // [width]
        // minimum number of characters to be written as output (in this case, 10)
        System.out.printf("Hello %10s", myString);

        // [precision]
        // sets number of digits of precision when outputting floating-point values (in this case 2)
        System.out.printf("You have this much money %.2f ", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator is numbers > 1000
        System.out.printf("You have this much money %+f ", myDouble);
    }
    
}
