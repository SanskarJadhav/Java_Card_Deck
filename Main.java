// Sanskar Jadhav AIML B1 PRN 21070126076

import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Deck d = new Deck();
        int run;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\nMENU\n====");
            System.out.println("1. Create a deck");
            System.out.println("2. See the deck");
            System.out.println("3. See top card");
            System.out.println("4. Compare suits for two cards");
            System.out.println("5. Compare values for two cards");
            System.out.println("6. Find a specific card in the deck");
            System.out.println("7. Deal a hand");
            System.out.println("8. Shuffle the deck");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            // creating a switch case
            switch(choice){
                case 1:
                    d.createDeck();
                    System.out.println("Deck has been created.");
                    break;
                case 2:
                    d.printDeck();
                    break;
                case 3:
                    d.printCard();
                    break;
                case 4:
                    d.sameCard();
                    break;
                case 5:
                    d.compareCard();
                    break;
                case 6:
                    d.findCard();
                    break;
                case 7:
                    d.dealCard();
                    break;
                case 8:
                    d.shuffleDeck();
                    System.out.println("Deck has been shuffled.");
                    break;
                default:
                    System.out.println("Wrong input. Please enter a number from 1 to 8.");
            }
            System.out.print("\nRun again? Yes - 1, No - 0 : ");
            run = sc.nextInt();
        } while (run!=0);
    }
}
