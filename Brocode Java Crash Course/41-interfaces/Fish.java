public class Fish implements Prey, Predator{

    //add 2 interfaces to fish and define methods

    @Override
    public void flee() {
        System.out.println("This fish is fleeing from bigger fish");
    }

    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }
    
}
