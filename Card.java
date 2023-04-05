import java.util.*; 
public class Card { 

    private int rank; // Instance variable to store the rank of the card
    private int suit; // Instance variable to store the suit of the card

    public Card() { // Default constructor that sets rank and suit to 0
        this.rank = 0;
        this.suit = 0;
    }

    public Card(int rank, int suit) { 
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() { // Getter method to get the rank of the card
        return rank;
    }

    public int getSuit() { // Getter method to get the suit of the card
        return suit;
    }

    public void printCard() { // Method to print the card in a human-readable format
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"}; // Array of ranks
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"}; // Array of suits
        System.out.println(ranks[rank] + " of " + suits[suit]); // Printing the card as "rank of suit"
    }

    public static Vector<Card> createDeck() { 
        Vector<Card> deck = new Vector<Card>(); // Creating a new Vector to store the cards

        for (int suit = 0; suit < 4; suit++) { 
            for (int rank = 0; rank < 13; rank++) { 
                deck.add(new Card(rank, suit)); // Adding a new Card object with the given rank and suit to the deck
            }
        }

        return deck;
    }

    public static void printDeck(Vector<Card> deck) { // Static method to print all cards in a given deck
        for (int i = 0; i < deck.size(); i++) { 
            deck.get(i).printCard(); 
        }
    }

    public static boolean sameCard(Card c1, Card c2) { // Static method to check if two cards are the same
        return c1.getRank() == c2.getRank() && c1.getSuit() == c2.getSuit(); // Comparing the ranks and suits of the two cards
    }

    public static int compareCard(Card c1, Card c2) { // Static method to compare two cards
        if (c1.getRank() < c2.getRank()) { // If the rank of c1 is lower than that of c2
            return -1; // Return -1
        } else if (c1.getRank() > c2.getRank()) { // If the rank of c1 is higher than that of c2
            return 1; // Return 1
        } else { // If the ranks are the same
            return Integer.compare(c1.getSuit(), c2.getSuit()); // Compare the suits using the Integer.compare method
        }
    }

    public static void sortDeck(Vector<Card> deck)
{
    Collections.sort(deck, new Comparator<Card>()
    {
        @Override
        public int compare(Card c1, Card c2)
        {
            // Compares two cards using the compareCard method
            return compareCard(c1, c2);
        }
    });
}

public static int findCard(Vector<Card> deck, Card card) 
{
    // Searches for a given card in the deck and returns its index
    for (int i = 0; i < deck.size(); i++)
    {
        if (sameCard(deck.get(i), card)) 
        {
            return i;
        }
    }
    // Returns -1 if the card is not found in the deck
    return -1;
}

public static void dealCards(Vector<Card> deck, int numCards)
{
    // Deals a specified number of cards from the deck
    Random rand = new Random();
    for (int i = 0; i < numCards; i++) {
        // Generates a random index to remove a card from the deck
        int index = rand.nextInt(deck.size());
        Card card = deck.remove(index);
        card.printCard();
    }
}
}

           
