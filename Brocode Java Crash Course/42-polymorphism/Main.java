public class Main {
    
    public static void main(String[] args) {
        
        // polymorphism = greek word for poly (many), morph (form)
        // the ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        // lets store in an array called racers
        // Vehicle is the shared parent data type

        Vehicle[] racers = {car, bicycle, boat};

        // individually call
        car.go();
        bicycle.go();
        boat.go();

        // or create for-each loop
        for (Vehicle x: racers) {
            x.go();
        }
    }
}
