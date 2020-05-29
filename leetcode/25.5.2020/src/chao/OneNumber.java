package chao;

import org.junit.Assert;
import org.junit.Test;

/**
 * 给定数组 找出只出现一次的数字（默认其他数字均出现两次）
 */
public class OneNumber {

  public int singleNumber(int[] nums) {
    int temp = 0;
    for (int num : nums) {
      temp ^= num; //任何数和0异或都是自身这个数；任何数和自身异或都是0
    }
    return temp;
  }


  @Test
  public void test() {
    Assert.assertEquals(4, singleNumber(new int[]{1, 2, 2, 1, 4}));
  }

}
