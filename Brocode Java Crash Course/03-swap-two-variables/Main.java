public class Main {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Wine";
        String temp = null; //don't need to assign to null
        
        // temp temporarily stores one of the values 
        temp = x;
        x = y; 
        y = temp;

        System.out.println("x:" + x);
        System.out.println("y:" + y);


    }
}
