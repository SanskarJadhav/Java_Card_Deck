import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Deck {
    // defining string array of suits and values
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    // vector of Cards
    Vector<Card> cards = new Vector<Card>();
    Scanner sc = new Scanner(System.in);
    // method to create a deck
    public void createDeck() {
        for (String s: suits){
            for (String v: values){
                this.cards.add(new Card(s, v));
            }
        }
    }
    // method to shuffle the deck
    public void shuffleDeck() {
        // using Collections.shuffle
        Collections.shuffle(this.cards);
    }
    // method to print the Deck
    public void printDeck() {
        for(int i=0; i<52; i++) {
            System.out.println(cards.get(i));
        }
    }
    // method to display top card
    public void printCard() {
        System.out.println("First card is " + cards.get(0));
    }
    // method to compare suits of 2 cards
    public void sameCard() {
        // let user select position of cards from deck
        System.out.print("Select a number from 1 to 52: ");
        int index1 = sc.nextInt();
        // for displaying the card
        Object c1 = cards.get(index1-1);
        // for storing the suit of the card
        Object c1suit = cards.get(index1-1).getSuit();
        System.out.print("Select another number from 1 to 52: ");
        int index2 = sc.nextInt();
        Object c2 = cards.get(index2-1);
        Object c2suit = cards.get(index2-1).getSuit();
        System.out.println("First card is "+c1);
        System.out.println("Second card is "+c2);
        // if else case for output when suits are same or different
        if(c1suit.equals(c2suit)){
            System.out.println("Both cards share the same suit: " + c1suit);
        }
        else{
            System.out.println("The cards have different suits.");
        }
    }
    // method to compare values of 2 cards
    public void compareCard() {
        // same rank
        System.out.print("Select a number from 1 to 52: ");
        int index1 = sc.nextInt();
        Object c1 = cards.get(index1-1);
        Object c1value = cards.get(index1-1).getValue();
        System.out.print("Select another number from 1 to 52: ");
        int index2 = sc.nextInt();
        Object c2 = cards.get(index2-1);
        Object c2value = cards.get(index2-1).getValue();
        // to compare which rank is higher
        // by comparing indices in values array
        int rank1 = 0, rank2 = 0;
        for(int i = 0; i < values.length; i++) {
            if(values[i] == c1value) {
                rank1 = i;
            }
            if(values[i] == c2value) {
                rank2 = i;
            }
        }
        System.out.println("First card is "+c1);
        System.out.println("Second card is "+c2);
        // if condition for output in 3 cases
        if(c1value.equals(c2value)){
            System.out.println("Both cards share the same rank: " + c1value);
        }
        else if (rank1 > rank2) {
            System.out.println("First card has a higher rank.");
        }
        else {
            System.out.println("Second card has a higher rank.");
        }
    }
    // method to deal first 5 cards
    public void dealCard() {
        for(int i=0; i<5; i++) {
            System.out.println(cards.get(i));
        }
    }
    // method to find the position of a card in the deck
    public void findCard() {
        // let user enter value and suit
        System.out.println("Enter the value of the card: ");
        String v = sc.next();
        System.out.println("Enter the suit of the card: ");
        String s = sc.next();
        Card c1 = new Card(s, v);
        // find index of the entered card in the cards vector
        int position = 0;
        for(Card i: cards){
            if(i.getSuit().equals(c1.getSuit()) && i.getValue().equals(c1.getValue())){
                position = cards.indexOf(i);
                break;
            }
        }
        System.out.println("Position in deck is " + (position + 1));
    }
}
