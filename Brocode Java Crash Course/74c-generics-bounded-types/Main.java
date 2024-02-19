public class Main {

    public static void main(String[] args) {

        // bounded types = you can create the objects of a generic 
        // class to have data of specific derived types ex. Number

        // i.e. lets say we only want to pass numbers
        // these would work
        MyGenericClass<Integer, Integer> myInt = new MyGenericClass<>(1,9);
        MyGenericClass<Double, Double> myDouble = new MyGenericClass<>(3.14, 1,01);
        
        // these would not work
        // MyGenericClass<Character, Character> myChar = new MyGenericClass<>('@', '$');
        // MyGenericClass<String, Character> myString = new MyGenericClass<>("Hello", '!');
       
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        // System.out.println(myChar.getValue());
        // System.out.println(myString.getValue());
        
    }
    
}
