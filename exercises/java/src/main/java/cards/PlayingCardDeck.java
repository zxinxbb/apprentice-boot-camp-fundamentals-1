package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlayingCardDeck implements Deck {
    private List<PlayingCard> playingCards;


    public List<PlayingCard> getPlayingCards() {
        return playingCards;
    }

    public PlayingCardDeck() {
        playingCards = new ArrayList<>();
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
                playingCards.add(new PlayingCard(newSuit, faceValue));
            }
        }
    }


    public void shuffle() {
       Collections.shuffle(playingCards);
    }

    public String[] getCards() {
        String[] result = new String[playingCards.size()];
        for (int i = 0; i < playingCards.size(); i++) {
            Card card = playingCards.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    public Card deal() {
        return playingCards.remove(0);
    }
}