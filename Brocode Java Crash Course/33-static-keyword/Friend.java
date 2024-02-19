public class Friend {

    String name;

    // apply static to a variable
    static int numberOfFriends;

    Friend(String name){

        this.name = name;
        numberOfFriends++;
    }

    // static to a method

    static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends");
    }
    
}
