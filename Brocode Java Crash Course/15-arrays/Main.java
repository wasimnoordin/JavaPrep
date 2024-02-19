public class Main {
    public static void main(String[] args) {
        
        // array = used to store multiple values in a single variable
        // data types of added values must be same as data type of array
        String[] cars = {"Camaro", "Corvette", "Tesla"};

        cars[0] = "Mustang";
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // another way to write an array
        String[] automobiles = new String[4];
        automobiles[0] = "Camaro";
        automobiles[1] = "Corvette";
        automobiles[2] = "Tesla";
        automobiles[3] = "BMW";

        // use for loop to iterate through elements of an array
        for (int i = 0; i < automobiles.length; i++) {
            System.out.println(automobiles[i]);
        }
    }
    
}
