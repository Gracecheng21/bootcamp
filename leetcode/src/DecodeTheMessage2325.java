public class DecodeTheMessage2325 {

  public String decodeMessage(String key, String message) {
    int[] indexes = new int [26];
    char[] chs = key.toCharArray();
    Array
    // t -> 0
    int pos = 0;
    for (int i = 0; i < chs.length; i++) {
      if (chs[i] != ' ' && indexes[chs[i] - 'a'] == 0) {
        indexes[chs[i] - 'a'] = pos;
        pos++;
      }
    }
    StringBuilder decodedMessage = new StringBuilder("");
    for (char ch : message.toCharArray()) {
      if (ch == ' ') {
        decodedMessage.append(' ');
      } else {
        System.out.println("before=" + ch + " " + (ch - 'a' + 1));
        char ch
      }
    }
}
}