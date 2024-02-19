public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a subclass
        // abstract methods are delclared without an implementation

        Car car = new Car();

        // won't be able to create vehicle class becuase its abstract
        // Vehicle vehicle = new Vehicle(); 

        // we walk into a car dealership, salesperson acts what vehicle we want
        // abstract forces a user to pick a certain type of vehicle

        car.go();

    }
    
}
