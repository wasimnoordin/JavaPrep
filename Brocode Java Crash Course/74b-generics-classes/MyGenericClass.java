public class MyGenericClass <Thing> {

    // there can be multiple generic parameters
    // i.e. public class MyGenericClass <Thing, Thing2>

    Thing x; 

    MyGenericClass(Thing x) {
        this.x = x;
    }

    public Thing getValue() {
        return x;
    }
    
}
