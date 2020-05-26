package chao;

import org.junit.Assert;
import org.junit.Test;

public class IntegerReverse {

  public int reverse(int x) {
    int reverseNum = 0;
    while (x != 0) {
      if (reverseNum > Integer.MAX_VALUE / 10 || (reverseNum == Integer.MAX_VALUE / 10
          && x % 10 > 7)) {
        return 0;
      }
      if (reverseNum < Integer.MIN_VALUE / 10 || (reverseNum == Integer.MIN_VALUE / 10
          && x % 10 < -8)) {
        return 0;
      }
      reverseNum = reverseNum * 10 + x % 10;
      x /= 10;
    }

    return reverseNum;
  }

  @Test
  public void test() {
    Assert.assertEquals(321, reverse(123));
    Assert.assertEquals(21, reverse(120));
    Assert.assertEquals(1234567, reverse(7654321));
    Assert.assertEquals(-2147483641, reverse(-1463847412));
  }
}
