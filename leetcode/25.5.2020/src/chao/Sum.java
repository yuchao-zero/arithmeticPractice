package chao;

import java.util.Arrays;

public class Sum {

  /**
   *
   * @param nums
   * @param target
   * @return index
   */
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[]{i,j};
        }
      }
    }
    throw new IllegalArgumentException("no coincident nums");
  }

  public static void main(String[] args) {
    int[] nums = new int[]{1, 7, 3, 15};
    System.out.println(Arrays.toString(new Sum().twoSum(nums, 9)));
  }
}
