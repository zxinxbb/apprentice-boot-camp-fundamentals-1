package cards;

import java.util.ArrayList;
import java.util.Arrays;

public class Cards {
    public static void main(String[] args) {
        Cards cards = new Cards();
        String[] deckInOrder = cards.getCards();
        for(String card: deckInOrder){
            System.out.println(card);
        }
    }

    public String[] getCards() {
        String[] result = new String[52];
        PlayingCard[] deck = new PlayingCard[52];
        String suitName = "";
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {
                //suit is either 0,1,2,3 and we need to return a suit.
                //then need a string to suit method

                switch (suit){
                    case 0: suitName = "clubs"; break;
                    case 1: suitName = "diamonds"; break;
                    case 2: suitName = "hearts"; break;
                    case 3: suitName = "spades"; break;
                }
                Suit newSuit = new Suit(suitName);
               deck[suit*13+faceValue] = new PlayingCard(newSuit, faceValue);
            }
        }
        int cardNumber = 0;
        for (PlayingCard card : deck) {
            String faceValueName;
            switch (card.getFaceValue()){
                case 0: faceValueName = "ace"; break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9: faceValueName = Integer.toString(card.getFaceValue()+1); break;
                case 10: faceValueName = "jack"; break;
                case 11: faceValueName = "queen"; break;
                case 12: faceValueName = "king"; break;
                default: throw new IllegalArgumentException("Something went wrong " + card + "is not a valid faceValue!");
            }



            result[cardNumber] = faceValueName + " of " + card.getSuit().getName();
            cardNumber++;
        }

        return result;
    }
}
