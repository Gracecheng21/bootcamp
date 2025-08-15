public class Deck {
  // Static Variable (字典 dictionary)
  public static final int[] RANKS = // final (鎖住條arrays) , static (開放資料)
    new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13}; // int[] {}, {}內輸入已知內容
  public static final String[] SUITS =
    new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"}

  // Attributes (Instance Variable), instance = object
  private Card[] cards;

  // 用arrays指定用幾多個位置
  public Deck() { 
    this.cards = new Card[RANKS.length * SUITS.length + 1]; // 0-51
    //this.card[0] = new Card(1,"SPADE"); // 邏輯上岩，但實際唔會咁做，會打到手殘
    int idx = 0;
    for (String suit : SUITS) {
      for (int rank : RANKS) {
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
//    X for (int i = 0; i < SUITS.length; i++) {
//    X  for (int j = 0; j < RANKS.length; j++) {
//    X    cards[idx++] = new Card(j, null);

      }
        // new Card
      }
    }
  }

  public static void main(String[] args) {
    new Deck();
  }


}
