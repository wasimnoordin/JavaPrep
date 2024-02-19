public class Main {
    public static void main(String[] args) {
        
        // toString() = special method that all objects inherit
        // returns a string that "textually represents" an object
        // can be used implicitly and explicitly

        Car car = new Car();

        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.color);
        System.out.println(car.year);

        // if we print just car, it will be the address of the car object
        System.out.println(car);

        // now lets try to use the overridden toString() method EXPLICITLY to get a textual representation
        System.out.println(car.toString());

        // what about IMPLICITLY - we get the same result
        System.out.println(car);
    }

    
}
