import java.util.Random;

public class Main {

    public static void main(String[] args) {
        
        // not truly random = pseudo-random!
        Random random = new Random();

        int x = random.nextInt();
        System.out.println(x);

        // lets limit the range of random
        int y = random.nextInt(6); //between 0-5
        System.out.println(y);

        double z = random.nextDouble();
        System.out.println(z);

        boolean b = random.nextBoolean();
        System.out.println(b);
    }
}
