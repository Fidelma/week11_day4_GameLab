
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Card card;

    @Before
    public void setup(){
        player = new Player("Player1");
        card = new Card(SuitType.HEARTS, RankType.KING);
    }

    @Test
    public void playerHasName() {
        assertEquals("Player1", player.getName());
    }

    @Test
    public void canAddCard() {
        player.addCard(card);
        assertEquals(1, player.sizeOfHand());
    }
}
