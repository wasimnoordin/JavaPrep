public class Main {
    public static void main(String[] args) {
        
        // inheritance = the process where one class acquires 
        //               the attributes and methods of another. 

        // in this example, lets make car and bicycle inherit everything from vehicle

        Car car = new Car();
        car.go();

        Bicycle bike = new Bicycle();
        bike.stop();

        // inherited attributes
        
        System.out.println(car.speed);
        System.out.println(bike.speed);

        // individual attributes

        System.out.println(car.doors);
        System.out.println(bike.pedals);
    }
    
}
