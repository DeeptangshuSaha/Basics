package WeeK1;

public class MaxSumSubarray {
  public static int maxSum(int[] arr, int k) {
    int windowSum = 0, maxSum = 0;

    // first window
    for (int i = 0; i < k; i++) {
      windowSum += arr[i];
    }
    maxSum = windowSum;

    // slide
    for (int i = k; i < arr.length; i++) {
      windowSum += arr[i] - arr[i - k];
      maxSum = Math.max(maxSum, windowSum);
    }
    return maxSum;
  }

  public static void main(String[] args) {
//    int[] arr = {1,3,4,2,6,5,7,5,2,8,1};
//    int k = 4;
    int[] arr = {2,1,5,1,3,2};
    int k = 3;
    System.out.println(maxSum(arr, k)); // should print 9
  }
}
