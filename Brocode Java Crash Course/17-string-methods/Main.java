public class Main {
    public static void main(String[] args) {
        // String = reference data types that can stored one or more characters
        // reference data types have access to useful methods

        String name = "Sim";

        boolean result = name.equals("Sim"); // compares two strings to see if they're equal
        System.out.println(result);

        int resultLength = name.length(); // returns int based on length of string
        System.out.println(resultLength);

        char resultCharAt = name.charAt(0); // returns character at an index
        System.out.println(resultCharAt);

        int resultIndexOf = name.indexOf("m"); // will return the index of where a method finds that character
        System.out.println(resultIndexOf);

        boolean resultIsEmpty = name.isEmpty(); // will return true if empty
        System.out.println(resultIsEmpty);

        String resultUpper = name.toUpperCase(); // return all uppercase
        System.out.println(resultUpper);

        String resultLower = name.toLowerCase(); // return all lowercase
        System.out.println(resultLower);

        String resultTrim = name.trim(); // trim empty space before and after string
        System.out.println(resultTrim);

        String resultReplace = name.replace('S', 'a'); // replace a character with another in a String
        System.out.println(resultReplace); 

    }
    
}
