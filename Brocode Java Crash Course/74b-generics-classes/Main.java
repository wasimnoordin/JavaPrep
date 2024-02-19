public class Main {

    public static void main(String[] args) {
        
        MyGenericClass<Integer> myInt = new MyGenericClass<>(1);
        MyGenericClass<Double> myDouble = new MyGenericClass<>(3.14);
        MyGenericClass<Character> myChar = new MyGenericClass<>('@');
        MyGenericClass<String> myString = new MyGenericClass<>("Hello");

        // refresher ArrayList - it's very ismilar to generic class!
        ArrayList<String> myFriends = new ArrayList<>();
        
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
        



    }
    
}
