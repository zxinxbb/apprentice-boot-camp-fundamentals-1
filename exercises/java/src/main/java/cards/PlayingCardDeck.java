package cards;

public class PlayingCardDeck {
    private PlayingCard[] playingCards = new PlayingCard[52];


    public PlayingCard[] getPlayingCards() {
        return playingCards;
    }

    public PlayingCardDeck createsOrderedDeck() {
        PlayingCardDeck deck = new PlayingCardDeck();
        String suitName = "";
        for (int suit = 0; suit < 4; suit++) {
            for (int faceValue = 0; faceValue < 13; faceValue++) {

                switch (suit) {
                    case 0:
                        suitName = "clubs";
                        break;
                    case 1:
                        suitName = "diamonds";
                        break;
                    case 2:
                        suitName = "hearts";
                        break;
                    case 3:
                        suitName = "spades";
                        break;
                }
                Suit newSuit = new Suit(suitName);
                deck.getPlayingCards()[suit * 13 + faceValue] = new PlayingCard(newSuit, faceValue);
            }
        }
        return deck;
    }
}