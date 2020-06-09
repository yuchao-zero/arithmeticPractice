package chao;

import org.junit.Assert;
import org.junit.Test;

public class publicSubString {

  public String longestCommonPrefix(String[] strs) {
    //思路：先拿每一个字符串出来，然后放在字符数组内，每个字符数组比较
    if (strs == null || strs.length == 0) {
      return "";
    }
    int index = 0;//最短字符串的下标
    for (int i = 1; i < strs.length; i++) {
      if (strs[i].length() < strs[index].length()) {
        index = i;
      }
    }
    for (int i = 0; i < strs.length; i++) {
      int j = 0;
      for (; j < strs[index].length(); j++) {
        if (strs[index].charAt(j) != strs[i].charAt(j)) {
          break;
        }
      }
      strs[index] = strs[index].substring(0, j);
    }
    return strs[index];
  }

  @Test
  public void test() {
    String[] strings = {"31234", "1234567", "12"};
    Assert.assertEquals("", longestCommonPrefix(strings));
  }


}
