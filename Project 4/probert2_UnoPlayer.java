
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class probert2_UnoPlayer implements UnoPlayer {

    /**
     * play - This method is called when it's your turn and you need to
     * choose what card to play.
     *
     * The hand parameter tells you what's in your hand. You can call
     * getColor(), getRank(), and getNumber() on each of the cards it
     * contains to see what it is. The color will be the color of the card,
     * or "Color.NONE" if the card is a wild card. The rank will be
     * "Rank.NUMBER" for all numbered cards, and another value (e.g.,
     * "Rank.SKIP," "Rank.REVERSE," etc.) for special cards. The value of
     * a card's "number" only has meaning if it is a number card. 
     * (Otherwise, it will be -1.)
     *
     * The upCard parameter works the same way, and tells you what the 
     * up card (in the middle of the table) is.
     *
     * The calledColor parameter only has meaning if the up card is a wild,
     * and tells you what color the player who played that wild card called.
     *
     * Finally, the state parameter is a GameState object on which you can 
     * invoke methods if you choose to access certain detailed information
     * about the game (like who is currently ahead, what colors each player
     * has recently called, etc.)
     *
     * You must return a value from this method indicating which card you
     * wish to play. If you return a number 0 or greater, that means you
     * want to play the card at that index. If you return -1, that means
     * that you cannot play any of your cards (none of them are legal plays)
     * in which case you will be forced to draw a card (this will happen
     * automatically for you.)
     */
    public int play(List<Card> hand, Card upCard, Color calledColor,
    GameState state) {
        //Find color and rank of upCard
        UnoPlayer.Color upCardColor = upCard.getColor();
        UnoPlayer.Rank upCardRank = upCard.getRank();
        int upCardNumber = upCard.getNumber();
        
        //Return Cards
        for (int i = 0; i < hand.size(); i++){
            //Wildcards first
            if (hand.get(i).getRank() == UnoPlayer.Rank.WILD || hand.get(i).getRank() == UnoPlayer.Rank.WILD_D4){
                return i;
            }
            //Specials next
            if(hand.get(i).getRank() == UnoPlayer.Rank.DRAW_TWO || hand.get(i).getRank() == UnoPlayer.Rank.REVERSE || hand.get(i).getRank() == UnoPlayer.Rank.SKIP){
                if (hand.get(i).getRank() == upCardRank || hand.get(i).getColor() == upCardColor){
                    return i;
                }
            }
            //Now if wild is played - must return based on calledColor, not upCardColor
            if(hand.get(i).getColor() == calledColor){
                return i;
            }
            //Next by number
            if(upCardNumber != -1 && upCardNumber == hand.get(i).getNumber() ){
                return i;
            }
            //Finally by upCardColor
            if(hand.get(i).getColor() == upCardColor){
                return i;
            }

        }

        return -1;         
    }
      
   
    
    /**
         * callColor - This method will be called when you have just played a
         * wild card, and is your way of specifying which color you want to 
         * change it to.
         *
         * You must return a valid Color value from this method. You must not
         * return the value Color.NONE under any circumstances.
         */
        public Color callColor(List<Card> hand, GameState state) {

        //find the frequency of each color in the hand
        //red
        int redfreq = Collections.frequency(hand, UnoPlayer.Color.RED);
        //blue
        int bluefreq = Collections.frequency(hand, UnoPlayer.Color.BLUE);
        //green
        int greenfreq = Collections.frequency(hand, UnoPlayer.Color.GREEN);
        //yellow
        int yellowfreq = Collections.frequency(hand, UnoPlayer.Color.YELLOW);

        //for loop to find colors of skip cards
        Color skipcolor = Color.NONE;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getRank() == UnoPlayer.Rank.SKIP){
                skipcolor = hand.get(i).getColor();
            }
        }

        //for loop to find colors of reverse cards
        Color reversecolor = Color.NONE;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getRank() == UnoPlayer.Rank.REVERSE){
                reversecolor = hand.get(i).getColor();
            }
        }

        //for loop to find colors of draw two cards
        Color drawtwocolor = Color.NONE;
        for(int i = 0; i < hand.size(); i++){
            if(hand.get(i).getRank() == UnoPlayer.Rank.DRAW_TWO){
                drawtwocolor = hand.get(i).getColor();
            }
        }

        //if else network to find which frequency has the greatest value and return that value
        //return colors first
        if(redfreq > bluefreq && redfreq > greenfreq && redfreq > yellowfreq){
            return Color.RED;
        } else if(bluefreq > redfreq && bluefreq > greenfreq && bluefreq > yellowfreq){
            return Color.BLUE;
        } else if(greenfreq > redfreq && greenfreq > bluefreq && greenfreq > yellowfreq){
            return Color.GREEN;
        } else if(yellowfreq > redfreq && yellowfreq > bluefreq && yellowfreq > greenfreq){
            return Color.YELLOW;

        //now return special cards
        } else if(hand.contains(UnoPlayer.Rank.SKIP) == true){
            return skipcolor;
        } else if(hand.contains(UnoPlayer.Rank.REVERSE) == true){
            return reversecolor;
        } else if(hand.contains(UnoPlayer.Rank.DRAW_TWO) == true){
            return drawtwocolor;
        //Last resort
        } else{
            return Color.BLUE;
        }

    }
}