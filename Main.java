import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Creates a new deck of cards
            Vector<Card> deck = Card.createDeck();
            int choice;

            do {
                // Prints out the menu of options for the user to choose from
                System.out.println("1. Print the deck");
                System.out.println("2. Deal cards");
                System.out.println("3. Sort the deck");
                System.out.println("4. Search for a card");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");

                choice = scanner.nextInt();

                // Switch statement to handle the user's choice
                switch (choice) {
                    case 1:
                        Card.printDeck(deck);
                        break;
                    case 2:
                        System.out.print("Enter the number of cards to deal: ");
                        int numCardsToDeal = scanner.nextInt();
                        // Calls the dealCards method to deal the requested number of cards
                        Card.dealCards(deck, numCardsToDeal);
                        break;
                    case 3:
                        // Calls the sortDeck method to sort the deck
                        Card.sortDeck(deck);
                        System.out.println("Deck sorted!");
                        break;
                    case 4:
                        System.out.print("Enter the rank of the card (0-12): ");
                        int rank = scanner.nextInt();
                        System.out.print("Enter the suit of the card (0-3): ");
                        int suit = scanner.nextInt();
                        Card card = new Card(rank, suit);
                        // Calls the findCard method to search for the card in the deck
                        int index = Card.findCard(deck, card);

                        if (index == -1) {
                            // If the card is not found, prints a message to the console
                            System.out.println("Card is not in deck");
                        } else {
                            // If the card is found, prints its index in the deck to the console
                            System.out.println("Card found at index " + index + " in the deck.");
                        }
                        break;
                    case 0:
                        // Exits the loop and terminates the program
                        System.out.println("Closing program");
                        break;
                    default:
                        // If the user enters an invalid choice, prints an error message.
                        System.out.println("Invalid choice!");
                }

                System.out.println();

            } while (choice != 0);
        }
    }
}
