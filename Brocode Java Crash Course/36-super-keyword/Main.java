public class Main {
    public static void main(String[] args) {
        
        // super = keyword refer to the superclass (parent) of an object
        // very similar to the "this" keyword

        // create superhero objects and pass arguments to constructor
        // name, age, power

        Hero hero1 = new Hero("Batman", 42, "$$$");
        Hero hero2 = new Hero("Superman", 43, "everything");

        // a bit clunky
        // System.out.println(hero1.name);
        // System.out.println(hero1.age);
        // System.out.println(hero1.power);

        // using toString() is cleaner
        System.out.println(hero2.toString());

    }
    
}
