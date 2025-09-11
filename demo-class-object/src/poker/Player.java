package poker;
public class Player {
  private Card[] cards;

  //
  public Player() {
    this.cards = new Card[0];
  }
  
  public void receive(Card newCard) {
    Card[] newCards = new Card[this.cards.length];
    for (int i = 0; i < this.cards.length; i++) {
      newCards[i] = this.cards[i];
    }
    newCards[newCards.length - 1] = newCard;
    this.cards = newCards;
  }
  
  public static void main(String[] args) {
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    Deck d1 = new Deck();
  }

}
