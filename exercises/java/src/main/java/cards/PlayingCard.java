package cards;

public class PlayingCard implements Card {
    private Suit suit;
    private int faceValue;


    public PlayingCard(Suit suit, int faceValue) {
        this.suit = suit;
        this.faceValue = faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public Suit getSuit() {
        return suit;
    }

    public boolean snap(Card card) {
        return card instanceof PlayingCard && this.faceValue == (((PlayingCard) card).faceValue);
    }
}
