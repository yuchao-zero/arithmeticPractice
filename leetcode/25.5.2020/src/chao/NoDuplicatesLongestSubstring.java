package chao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//TODO complete
public class NoDuplicatesLongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    int length;
    //将字符串转换成字符数组，保存进顺序表
    List<char[]> list = new ArrayList<>();
    list.add(s.toCharArray());
    for(int i = 0;i < list.size();i++){
      //list.indexOf(list.get(i));
      for (int j = i + 1;j < list.size();j++){
        if(Arrays.equals(list.get(i), list.get(j))){
          length = list.indexOf(list.get(j)) - list.indexOf(list.get(i));
        }
      }
    }





    return 0;
  }

}
