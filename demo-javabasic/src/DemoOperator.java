public class DemoOperator {
  public static void main(String[] args) {
    // +,-,*,/,%
    int x = 3;
    x = 6 + 9;

    int y = 5 + x - 10;
    System.out.println(y); // 10

    int a = y - 9 * 2;
    System.out.println(a); // -8

    int b = (y - 9) * 2;
    System.out.println(b); // 2

    b = ((b - 10) + 2) * 2;
    System.out.println(b); // -12
    // only use () in java for calucution

    //divided by zero error in java
    // int r = 10 / 0; system error

    int r2 = 0 / 10;
    System.out.println(r2); // 0

    // Java: int / int = int
    int r3 = 10 / 3;
    System.out.println(r3); // around to integer = 3
    // int / int = int
    System.out.println(5 / 2); // 2
    // double / int = double / double = double
    System.out.println(5.0 / 2); // 2.5

    int score1 = 71;
    int score2 = 82;
    // (int + int) / int = int
    // ! (int + int) / double = double
    double averageScore = (score1 + score2) / 2.0;
    System.out.println(averageScore); // 76.5 
    //have to use double to calculate, double(right=ans) = / double(left) = double

    double score3 = 71.0;
    double score4 = 82.0;
    double averageScore1 = (score3 + score4) / 2;
    System.out.println(averageScore1);
    // double <-> double (left = right)

    // Big problem in java
    double d5 = 0.1 + 0.2;
    System.out.println(d5); // 0.30000000000000004 java haven't 0.1 format

    double d6 = 0.2 + 0.3;
    System.out.println(d6); // 0.5 not every formula is wrong

    // ! remainder % (餘數)
    int r8 = 10 % 3;
    System.out.println(r8); // 1


    // +1 and -1
    int t = 0;
    t++;
    ++t;
    t = t +1;
    t += 1;
    // "= t +" <-> "+="
    System.out.println(t); //4

    int w = 0; // w is initialized to 0
    w--;       // w = w - 1; (post-decrement), now w = -1
    --w;       // w = w - 1; (pre-decrement), now w = -2
    w = w - 1; // subtract 1 directly, now w = -3
    w -= 1;    // subtract 1 using compound assignment, now w = -4
    System.out.println(w); // -4
    // w = 0; w = -1; w = -2; w = -3; w = -4;
    // All four lines decrease w by 1, using different syntax.

    // +/- >1 value
    int o = 3;
    o -= 4;
    o += 4;
    System.out.println(o); // 3

    int q = 3;
    q = q * 3;
    q *= 3;
    System.out.println(q); //27

    int v = 27;
    v /= 3;
    v = v / 3;
    System.out.println(v); //3

    // Comparison
    // >, <, >=, <=, ==, !=
    int score = 91;
    boolean isGradeA = score >= 90;
    System.out.println(isGradeA); // true
    // sample clean readable statement

    char gender = 'M';
    boolean isFemale = gender != 'M';
    System.out.println(isFemale); // true
    // remember to read from left to right









  }
}
