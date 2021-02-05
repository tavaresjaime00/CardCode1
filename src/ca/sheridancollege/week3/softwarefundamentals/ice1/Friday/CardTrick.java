
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Jaime Tavares
 */
public class CardTrick {
    public static void main(String[] args)
    {
       Card card1 = new Card();
       // give card1 values
       card1.setValue(2);
       card1.setSuit("Clubs");
       System.out.println("Card1 Suit: " + card1.getSuit());
       System.out.println("Card1 Value: " + card1.getValue());
    }
    
}
