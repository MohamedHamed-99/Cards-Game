/**
 * A Card is a playing card from an Anglo-American deck of cards.
 * 
 * @author Lynn Marshall
 * @author Mohamed Hamed
 * @version 1.1 Februrary 15, 2019
 */
public class Card
{
    /** The card's suit: "hearts", "diamonds", "clubs", "spades". */
    private String suit;
    
    /** 
     * The card's rank, between 1 and 13 (1 represents the ace, 11 represents
     * the jack, 12 represents the queen, and 13 represents the king.)
     */
    private int rank;

    /**
     * Constructs a new card with the specified suit and rank.
     */
    public Card(String suit, int rank)
    {
        this.rank = rank;
        this.suit = suit;
    }
    
    /**
     * Returns this card's suit.
     * @return suit the suit of the card
     */
    public String suit()
    {
        return suit;
    }
    
    /**
     * Returns this card's rank.
     * @return rank of the card
     */
    public int rank()
    {
        return rank;
    }
    
    /**
     * Determines if this card has the same rank as the specified card.
     * 
     * @param aCard the specified card to compare with
     * @return returns true if the card has the same rank as the asigned one
     */
    public boolean hasSameRank(Card aCard)
    {
        if(rank == aCard.rank){
            return true;
        }
        return false;
    }
    
    /**
     * Determines if this card is equal to the specified card.
     * 
     * @param aCard the specified card to compare with
     * @reurns true if the two cards are equal
     */
    public boolean isEqualTo(Card aCard)
    {
         if(rank == aCard.rank && suit.equals(aCard.suit)){
             return true;
         }
         return false;    
    }
}
