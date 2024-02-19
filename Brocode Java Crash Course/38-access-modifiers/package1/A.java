package package1;

import package2.C;

public class A {

    // protected modifier (visible if class is a subclass of class that contains protected member)
    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {

        C c = new C();
        // System.out.println(c.defaultMessage); // won't work, not in same package
        System.out.println(c.publicMessage); // works fine

        B b = new B();
        // System.out.println(b.privateMessage); // won't work, A doesn't contain private
    }
    
}
