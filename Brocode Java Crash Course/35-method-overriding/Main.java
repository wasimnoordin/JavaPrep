public class Main {
    public static void main(String[] args) {
        // method overiding = delcaring a method in sub class,
        //                    which is already present in the parent class.
        //                    done so that the child can give its own implementation

        // lets create a dog object which uses overide

        Dog dog = new Dog();

        dog.speak();

        // lets create an animal object which uses its own implementation

        Animal animal = new Animal();

        animal.speak();
        
    }
    
}
