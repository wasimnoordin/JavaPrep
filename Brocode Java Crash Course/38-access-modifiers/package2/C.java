package package2;
import package1.*;

public class C {
    
    // no access modifier (only visible to anything in same package)
    String defaultMessage = "This is the default";

    // public modifier (visible to other packages)
    public String publicMessage = "This is public";

    // protected modifier (visible if class is a subclass of class that contains protected member)
    protected String protectedMessage = "This is protected";

    // private modifier (visible to class that contains itself)
    private String privateMessage = "This is private";

    
}
