public class Main {
    public static void main(String[] args) {
        
        // examples of arrays

        int[] numbers = new int[3];
        char[] characters = new char[4];
        String[] strings = new String[5];

        // array of objects

        // Food[] refrigerator = new Food[3];

        // create food to store

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        // store food

        Food[] refrigerator = {food1, food2, food3};

        // alternatively
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        System.out.println(refrigerator[0]); // address of food1
        System.out.println(refrigerator[0].name); // name variable
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
    
}
