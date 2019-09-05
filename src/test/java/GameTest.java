import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    Game game;
    Deck deck;
    Player player1;
    Player player2;

    @Before
    public void setup(){
        deck = new Deck();
        player1 = new Player("Player1");
        player2 = new Player("Player2");
        game = new Game(deck, player1, player2);
    }

    @Test
    public void canDealCard() {
        deck.populate();
        deck.shuffle();
        game.deal();
        assertEquals(1, player1.sizeOfHand());
        assertEquals(50, deck.sizeOfDeck());
    }
}
