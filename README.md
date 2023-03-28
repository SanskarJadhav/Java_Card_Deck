# Java_Card_Deck
The following java program consists of three classes: Main, Card, and Deck.

The Main class acts as a user interface, where the user can
- see a menu displaying all operations that can be done
- select one operation to perform
- choose to run the program again

The Main file has an instance, d, for the Deck class.

The Card class defines the following private variables:
- String suit: to store the suit of the card
- String value: to store the value of the card

It makes use of the setter and getter methods to store and retrieve the values respectively. The class also has one additional method, String toString() that returns a String format for displaying the card as how we would read one (value "of" suit).

The Deck class uses a vector of objects (Cards) to store all 52 cards. It defines two arrays, namely suits (Clubs, Diamonds, Hearts, Spades) and values (from Ace to King), and uses Scanner to take input from the user.

The methods used are:
- createDeck(): creates a new Object (Card) for all possible combinations of 13 values and 4 suits, hence all 52 cards are stored in the vector
- shuffleDeck(): uses Collections.shuffle to rearrange the cards vector
- printDeck(): uses an iterative for loop with cards.get() to display all cards in the vector
- printCard(): displays the first card with cards.get(0)
- sameCard(): displays two cards selected by the user from the deck, and checks whether the suits are the same or not
- compareCard(): displays two cards selected by the user from the deck, and checks whether their ranks are the same or one is higher than the other
- dealCard(): displays the first 5 cards from the deck (usually done after shuffling the deck, so you can run the shuffle deck method first, or if you want random cards, then you just have to write Collections.shuffle before dealing the cards) -- makes more sense to deal first five as that is what dealing is in real life card games
- findCard(): takes input of the value and suit from the user, then finds the index of the specified card in the deck and displays the position as index + 1
