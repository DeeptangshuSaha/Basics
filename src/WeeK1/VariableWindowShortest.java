package WeeK1;

public class VariableWindowShortest {
  public static void main(String[] args) {
    int[] arr = {2,3,1,2,4,7};
    int k = 7;
    int left = 0, minL = Integer.MAX_VALUE, sum=0;
    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];
      while (sum>=k) {
        minL = Math.min(minL, right - left + 1);
        sum -= arr[left];
        left++;
      }
    }
    System.out.println(minL == Integer.MAX_VALUE ? 0 : minL);
  }
}
