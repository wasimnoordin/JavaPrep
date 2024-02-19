public class Main {
    public static void main(String[] args) {

        // expression = operands & operators
        // operands = values, variables, numbers, quantity
        // operators = + - * / %

        int friends = 10;

        friends = friends + 1;
        System.out.println(friends);

        //shorthand
        friends++;
        System.out.println(friends);

        friends--;
        System.out.println(friends);

        //cast value to deal with truncation
        double enemies = 10;

        enemies = (double) enemies / 3;
        System.out.println(enemies);
    }
}
