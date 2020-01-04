import java.util.ArrayList;

/**
 * Hand models a hand of cards held by a player.
 * 
 * @author Lynn Marshall 
 * @author Mohamed HAmed
 * @version 1.1 March 1, 2019
 *
 */
public class Hand
{
    /** 
     * The cards are stored in a linked-list implementation of the
     * List collection.
     */
    private ArrayList<Card> cards;

    /**
     * Constructs a new, empty hand.
     */
    public Hand()
    {   
        cards = new ArrayList<Card>();
    }

    /**
     * Adds the specified card to this hand.
     * 
     * @param aCard the card which is gonna be added
     */
    public void addCard(Card aCard)
    {
        cards.add(aCard);
    }

    /**
     * Removes a card from this hand. Cards are removed in the order in
     * which they were added to the hand.
     * 
     * @return returns the card removed from his hand
     */
    public Card playCard()
    {
        return cards.remove(0);
    }

    /**
     * Returns the number of cards that are currently in this hand.
     * 
     * @return returns the nmber of cards in the hand
     */    
    public int size()
    {
        int count = 0;
        for(Card card:cards){
            count++;
        }
        return count;
    }

    /**
     * Determines if this hand is empty.
     * 
     * @return returns true if the list is empty
     */    
    public boolean isEmpty()
    {
        return cards.isEmpty();
    }

    /**
     * Returns a String that lists the ranks (but not the suits) of all the 
     * cards in this hand, starting with the first card and finishing with
     * the last card. For example, if the first card is the two of hearts, 
     * the second card is the five of diamonds, and the last card is the
     * queen of clubs, the String returned by this method will be: "2 5 12".
     * 
     * @return returns string for the rank of the cards in the hand
     */
    public String toString()
    {
        String Numbers = "";
        for (int i = 0; i < cards.size();i++){
            if(!(i==cards.size() - 1)){
                Numbers += cards.get(i).rank() + " ";
            }else{
                Numbers += cards.get(i).rank();
            }
        }
        return Numbers;
    }
}
