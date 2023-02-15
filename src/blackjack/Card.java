/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package blackjack;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author John Borillo
 * @author Arielle Kaye Rapi
 * @author Umut Dogan
 */
public abstract class Card {
    //default modifier for child classes
    public enum Suit {SPADES, CLUBS, HEARTS, DIAMONDS};
    public enum Value {ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING};
    private Suit s; // enum user defined datatype 
    private Value v;
    
    public Card(Suit s,Value v){
        this.s=s;
        this.v=v;
    }
    /**
     * @return the s
     */
    public Suit getS() {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(Suit s) {
        this.s = s;
    }

    /**
     * @return the v
     */
    public Value getV() {
        return v;
    }

    /**
     * @param v the v to set
     */
    public void setV(Value v) {
        this.v = v;
    }
    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
     */
    @Override
    public abstract String toString();

}
