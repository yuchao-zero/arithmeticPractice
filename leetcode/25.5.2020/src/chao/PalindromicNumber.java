package chao;


import org.junit.Assert;
import org.junit.Test;

public class PalindromicNumber {

  public boolean isPalindrome(int x) {
//    methodOne
    String s = String.valueOf(x);
    String st = new StringBuilder(s).reverse().toString();
    if (s.equals(st)) {
      return true;
    }
    return false;
  }
  //methodTwo
//    int digit = 0;
//    int y = x;
//    if (x < 0) {
//      return false;
//    }
//    while (y != 0) {
//      digit = digit * 10 + y % 10;
//      y /= 10;
//    }
//    if (digit == x) {
//      return true;
//    }
//    return false;
//  }

  @Test
  public void test() {
    Assert.assertEquals(true, isPalindrome(121));
    Assert.assertEquals(true, isPalindrome(0));
    Assert.assertEquals(false, isPalindrome(-121));
    Assert.assertEquals(false, isPalindrome(10));
  }
}


