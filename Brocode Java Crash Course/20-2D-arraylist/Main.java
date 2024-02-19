import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 2D ArrayList = a dynamic list of lists
        // You can change the size of these lists during runtime

        ArrayList<String> bakeArrayList = new ArrayList<>();

        bakeArrayList.add("pasta");
        bakeArrayList.add("garlic bread");
        bakeArrayList.add("donuts");
        System.out.println(bakeArrayList.get(2));

        ArrayList<String> produceArrayList = new ArrayList<>();

        produceArrayList.add("tomatoes");
        produceArrayList.add("zucchini");
        produceArrayList.add("peppers");
        System.out.println(produceArrayList.get(2));

        ArrayList<String> drinksArrayList = new ArrayList<>();

        drinksArrayList.add("soda");
        drinksArrayList.add("coffee");
        System.out.println(drinksArrayList);

        // create a 2D arraylist to contain these seperate arraylists
        ArrayList<ArrayList<String>> groceryArrayList = new ArrayList<>();
        
        groceryArrayList.add(bakeArrayList);
        groceryArrayList.add(produceArrayList);
        groceryArrayList.add(drinksArrayList);
        System.out.println(groceryArrayList.get(0).get(2)); // donuts
    }
}
