public class Game {
    private Deck deck;
    private Player player1;
    private Player player2;

    public Game(Deck deck, Player player1, Player player2){
        this.deck = deck;
        this.player1 = player1;
        this.player2 = player2;
    }
    public void deal(){
        player1.addCard(deck.removeCard());
        player2.addCard(deck.removeCard());
    }
}
