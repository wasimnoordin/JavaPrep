public class Main {
    public static void main(String[] args) {

        // static = modifier. A single copy of a variable/method is created and shared.
        // The class "owns" the static member. 

        // Friend 1 and 2 are sharing the numberOfFriends variable

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");        
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");


        // Don't need this if we create a satic method in our Friend class
        // System.out.println(Friend.numberOfFriends); // best practice
        // System.out.println(friend1.numberOfFriends); // not recommended

        Friend.displayFriends();
        
    }
}
