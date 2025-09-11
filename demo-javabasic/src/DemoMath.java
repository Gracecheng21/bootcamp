import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoMath {
  
  public static void main(String[] args) {
    // pow
    // 2^4 = 16
    double result = Math.pow(2.0, 4.0);
    System.out.println(result); // 16.0

    int x = 3;
    int y = 7;
    System.out.println(Math.abs(x - y)); // 4 , absolute value, x to y value

    System.out.println(Math.round(9.45)); // 9, rounding down
    System.out.println(Math.sqrt(81)); // 9.0

    System.out.println(Math.max(3, 9)); // 9
    System.out.println(Math.max(9, 3)); // 9

    System.out.println(Math.min(2,8)); // 2

    // Math: pow(), max(), min(), abs()
    // BigDecimal -> multiply / divide -> setScale() -> round
    double result1 = BigDecimal.valueOf(10.0) //
        .divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_DOWN) //
        .doubleValue();
    System.out.println(result1);
    // new Random()
  }
}
