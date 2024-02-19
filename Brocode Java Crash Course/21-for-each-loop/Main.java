import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // traversing technique to iterate through all elements in an array/collection
        // less steps, more readable
        // less flexible

        String[] animals = { "cat", "dog", "rat", "bird" };

        // data type, index in collection
        for (String i : animals) {
            System.out.println(i);
        }

        ArrayList<String> animalsArrayList = new ArrayList<String>();
        animalsArrayList.add("cat");
        animalsArrayList.add("dog");
        animalsArrayList.add("bird");

        // data type, index in collection
        for (String i : animalsArrayList) {
            System.out.println(i);
        }
    }

}
