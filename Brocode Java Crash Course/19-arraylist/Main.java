import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // ArrayList = a resizable array.
        // Elements can be added and removed after compilation phase. 
        // Store only reference data types
        // Or can store wrapper class of primitive data types

        ArrayList<String> food = new ArrayList<String>();
        food.add("pizza");
        food.add("hamburger");
        food.add("hot dog");

        // useful methods of ArrayLists
        food.set(0, "sushi"); // replace a value at an index
        food.remove(2); // remove an element
        food.clear(); // clears ArrayList

        // use .size for ArrayList, .length for array
        for(int i=0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
    }
    
}
