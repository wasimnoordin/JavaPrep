public class Human {

    String name;
    int age;
    double weight;
    
    // constructor with 3 parameters
    // constructors allow us to create different objects with different parameters
    Human(String name, int age, double weight) {

        // assign values to variables, need to use this keyword
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat() {
        System.out.println(this.name + "is eating");
    }

    void drink() {
        System.out.println(this.name + "is drinking");
    }
}
