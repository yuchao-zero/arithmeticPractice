package chao;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 */
public class Solution {

  List<Integer> list = new ArrayList<>();

  /**
   * 将自除数加入到数组中，
   *
   * @param left
   * @param right
   * @return ArrayList
   */
  public List<Integer> selfDividingNumbers(int left, int right) {
    while (left <= right) {
      if (isSelfDividingNumbers(left)) {
        list.add(left);
      }
      left++;
    }
    return list;
  }

  /**
   * 判断是否是自除数
   *
   * @param num
   * @return
   */
  public boolean isSelfDividingNumbers(int num) {
    int remainder;
    int temp = num;
    while (num != 0) {
      remainder = num % 10; //取尾数
      if(remainder == 0){
        return false;
      }
      if (temp % remainder == 0) {
        num /= 10;
      } else {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.selfDividingNumbers(1,22));
  }

//  @Test
//  public void test() {
//    Assert.assertEquals(true, isSelfDividingNumbers(1));
//    Assert.assertEquals(false, isSelfDividingNumbers(16));
//  }
}
