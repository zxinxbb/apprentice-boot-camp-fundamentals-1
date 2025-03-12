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

@Override
    public String toString (){
    String faceValueName;
    switch (faceValue) {
        case 0:
            faceValueName = "ace";
            break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
            faceValueName = Integer.toString(faceValue + 1);
            break;
        case 10:
            faceValueName = "jack";
            break;
        case 11:
            faceValueName = "queen";
            break;
        case 12:
            faceValueName = "king";
            break;
        default:
            throw new IllegalArgumentException("Something went wrong " + faceValue + "is not a valid faceValue!");
    }
    return faceValueName + " of " + suit.getName();
    }


}
