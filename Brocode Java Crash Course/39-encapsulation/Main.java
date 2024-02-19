public class Main {
    public static void main(String[] args) {
        // Escapsulation = attributes of a class will be hidden or private
        // can be accessed only through methods (getters and setters)
        // you should make attributes private if you don't have a reason to make them public/protected
        
        Car car = new Car("Chevrolet", "Camaro", "2021");

        // won't be visible
        // System.out.println(car.make);

        // use getter method to access

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());

        // won't be visible
        // car.year = 2022;

        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }

}
