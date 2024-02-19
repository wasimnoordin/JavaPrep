import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        // Serialisation = the process of converting an object into a byte stream.
        // persists (saves the state) the object after program exists
        // this byte stream can be saved as a file or sent over a network
        // can be sent to a different machine
        // byte stream can be saved as a file (.ser) which is platform dependent
        // (Think of it as if you're saving a file with the object's information)

        User user = new User();

        user.name = "Bro";
        user.password = "I love pizza";

        // user.sayHello();

        // Now lets save the state of this object
        // Steps to serialise:
        // 1. your object class should implement serialisable interface
        // 2. add import java.io.serialisable
        // 3. FileOutputStream fileOut = new FileOutputStream(file path);
        // 4. ObjectOutputStream out = new ObjectOutputStream(file path);
        // 5. out.writeObject(objectName)
        // 6. out.close(); fileOut.close();

        FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close(); 
        fileOut.close();

        System.out.println("Object info saved!");

    }
}
