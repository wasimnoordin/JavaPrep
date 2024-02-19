public class Main {

    public static void main(String[] args) {

        // interface = a template that can be applied to a Class
        // similar to inheritance, but specifies what a class has/must do
        // classes can apply more than one interface, inheritance is limited to 1 super

        // lets create two interfaces, prey and predator

        // lets test rabbit
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        // lets test hawk
        Hawk hawk = new Hawk();
        hawk.hunt();

        // lets test fish (multi interface)
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

    }

}
