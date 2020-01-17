import java.util.ArrayList;

public class TestingDeckOfCards {
    public static void main(String[] args)
    {
        DeckOfCards deck = new DeckOfCards();
        deck.displayDeck();

        System.out.println("\nafter shuffling");
        deck.shuffle();
        deck.displayDeck();

        System.out.println("\n\nDealing 5 cards");
        ArrayList<Card> dansHand = new ArrayList<Card>();
        ArrayList<Card> jaretsHand = new ArrayList<Card>();
        for (int i=1; i<=5; i++)
        {
            dansHand.add(deck.dealTopCard());
            jaretsHand.add(deck.dealTopCard());
        }

        System.out.printf("Dan's hand: %s%n", dansHand);
        System.out.printf("Jaret's hand: %s%n", jaretsHand);
    }
}
