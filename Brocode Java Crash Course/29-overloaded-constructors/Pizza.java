public class Pizza {

    // attributes

    String bread;
    String sauce;
    String cheese;
    String topping;
    

    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }    

    // what if we don't want any topping? Enter overloaded constructors

    Pizza(String bread, String sauce, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
    }

    // what about a vegan pizza?

    Pizza(String bread, String sauce) {
        this.bread = bread;
        this.sauce = sauce;
    }

    // what about just bread?

    Pizza(String bread) {
        this.bread = bread;
    }

    // what about nothing?
    
    Pizza() {
    }

}
