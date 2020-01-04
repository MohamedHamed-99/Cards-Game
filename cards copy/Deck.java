import java.util.ArrayList;
import java.util.Random;

/**
 * Deck models a deck of 52 Anglo-American playing cards.
 * 
 * @author Lynn Marshall 
 * @author Mohamed Hamed
 * @version 1.1 Feburary 20, 2019
 *
 */
public class Deck
{
    /** 
     * The cards are stored in a linked-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;
    
    /** Lowest ranking card (the ace). */
    private static final int ACE = 1;
    
    /** Highest ranking card (the king). */
    private static final int KING = 13;
    
    /** 
     * Total number cards in the deck (4 suits, each with 13 cards of 
     * different ranks).
     */ 
    private static final int TOTAL_CARDS = 52;
    
    /** 
     * Some constants that define the Strings for the various suits.
     */ 
    private static final String HEARTS = "hearts";
    private static final String DIAMONDS = "diamonds";
    private static final String CLUBS = "clubs";
    private static final String SPADES = "spades";

    /**
     * Constructs a new, unshuffled deck containing 52 playing cards.
     */
    public Deck()
    {
        cards = new ArrayList<Card>(TOTAL_CARDS);
        buildSuit(CLUBS);
        buildSuit(DIAMONDS);
        buildSuit(HEARTS);
        buildSuit(SPADES);
    }
    
    /**
     * Creates the 13 cards for the specified suit, and adds them
     * to this deck.
     * @param suit the specifed suit for the cards
     */
    private void buildSuit(String suit)
    {
        for(int i=0; i < KING ; i++){
            cards.add(new Card(suit, i+1));
        }
    }
 
    /**
     * Shuffles this deck of cards.
     */
    public void shuffle()
    {   
        Random random = new Random();
        for(int i = 0; i < 10000; i++){
            int num1 = random.nextInt(TOTAL_CARDS);
            int num2 = random.nextInt(TOTAL_CARDS);
            Card card = cards.get(num1);
            cards.set(num1,cards.get(num2));
            cards.set(num2,card);
        }
    }
 
    /**
     * Removes a card from this deck.
     */
    public Card dealCard()
    {
        return cards.remove(0);
    }
 
    /**
     * Determines if this deck is empty.
     * @return true if the deck is empty 
     */
    
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }
  
    /**
     * Returns the number of cards that are currently in the deck.
     */
    public int size()
    {
        int count = 0;
        for(Card card:cards){
            count++;
        }
        return count;
    }
}
