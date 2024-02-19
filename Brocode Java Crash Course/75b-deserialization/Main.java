import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Deserialisation = the reverse process of converting a byte stream into an object.
        // (Think of this as if you're loading a saved file)

        // Steps to deserialise:
        // 1. declare your object, don't instantiate
        // 2. your class should implement Serializable interface
        // 3. add import java.io.Serializable
        // 4. FileInputStream fileIn = new FileInputStream(file path);
        // 5. ObjectInputStream in = new ObjectInputStream(fileIn);
        // 6. objectName = (Class) in.readObject();
        // 7. in.close(); fileIn.close();

        User user = null;

        FileInputStream fileIn = new FileInputStream("UserInfo.ser"); // put actual location
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close(); 
        fileIn.close();

        System.out.println(user.name);
        System.out.println(user.password);
        user.sayHello();

    }
}
