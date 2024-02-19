import java.util.Random;

public class DiceRoller {

    // part of the global 
    // Random random;
    // int number;


    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    // alternatively using global

    // DiceRoller() {
    //     random = new Random();
    //     roll();
    // }

    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    } 
}
