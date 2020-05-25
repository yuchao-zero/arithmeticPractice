package chao;

import org.junit.Assert;
import org.junit.Test;

/**
 * 对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 */
public class PrefectNumber {

    public boolean checkPerfectNumber(int num) {
      int total = 0;
      if (num <= 0) {
        return false;
      }
      for (int i = 1; i * i < num; i++) {
        if (num % i == 0) {
          total += i;
          if (i * i != num) {
            total += num / i;
          }
        }
      }
      return total - num == num;
    }

  @Test
  public void test(){
    Assert.assertEquals(true,new PrefectNumber().checkPerfectNumber(28));
    Assert.assertEquals(false,new PrefectNumber().checkPerfectNumber(-1));
  }
}


