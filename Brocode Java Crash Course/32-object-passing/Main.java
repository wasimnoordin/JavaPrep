public class Main {
    public static void main(String[] args) {

        Garage garage = new Garage();

        // lets park a BMW in our garage class
        Car car1 = new Car("BMW");
        Car car2 = new Car("Tesla");

        // lets park a car(s) using garage
        garage.park(car1);
        garage.park(car2);
        
    }
    
}
