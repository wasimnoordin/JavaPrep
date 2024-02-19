package package2;

// to use A we need to import package1
import package1.*;

public class Asub extends A {

    public static void main(String[] args) {

        Asub asub = new Asub();
        System.out.println(asub.protectedMessage); // will work as Asub is child of A

    }

}
