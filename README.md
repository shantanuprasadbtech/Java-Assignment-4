# Deck of cards

This Java code creates a standard deck of 52 cards, then performs several operations on the deck such as displaying, shuffling, comparing, etc.

Card class

Constructors
Card(): a default constructor that sets rank and suit to 0
Card(int rank, int suit): a constructor that takes the rank and suit as parameters and sets them for the card

Methods
getRank(): a getter method that returns the rank of the card
getSuit(): a getter method that returns the suit of the card
printCard(): a method that prints the card in a human-readable format, e.g. "Ace of Hearts"
createDeck(): a static method that creates a new deck of cards and returns it as a Vector of Card objects
printDeck(Vector<Card> deck): a static method that prints all the cards in a given deck
sameCard(Card c1, Card c2): a static method that checks if two cards are the same
compareCard(Card c1, Card c2): a static method that compares two cards based on their ranks and suits
sortDeck(Vector<Card> deck): a static method that sorts a given deck of cards using the compareCard method
findCard(Vector<Card> deck, Card card): a static method that searches for a given card in a deck and returns its index
dealCards(Vector<Card> deck, int numCards): a static method that deals a specified number of cards from the deck at random

Main class
Creates a deck of cards then runs different functions on the deck based on the input taken from the user.
