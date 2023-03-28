public class Card {
    // creating private variables
    private String suit;
    private String value;

    // getter method for suit
    public String getSuit() {
        return suit;
    }

    // setter method for suit
    public void setSuit(String suit) {
        this.suit = suit;
    }

    // getter method for value
    public String getValue() {
        return value;
    }

    // setter method for value
    public void setValue(String value) {
        this.value = value;
    }

    // setting a parameterised constructor
    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    // display cards in string format
    public String toString(){
        return value + " of " + suit;
    }
}