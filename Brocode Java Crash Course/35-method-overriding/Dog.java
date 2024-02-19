public class Dog extends Animal {

    // this is the overriding method

    @Override // good practice 
    void speak() {
        System.out.println("The dog goes *bark*");
    }
    
}
