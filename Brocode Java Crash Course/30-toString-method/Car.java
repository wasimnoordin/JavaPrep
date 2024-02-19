public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "red";
    int year = 2021;
    
    // lets overide the toString() method
    public String toString() {
        
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
