package WeeK1;

import java.util.HashSet;

public class CountingWindows {
  public static void main(String[] args) {
    int[] arr = {1,2,1,2,3};
    int k = 2, count = 0, left=0, right=0;
    HashSet<Integer> set = new HashSet<>();
    while ( right < arr.length ) {
      int i = arr[right];
      if (set.contains(i)) {

      }
    }
  }
}
