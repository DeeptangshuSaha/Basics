package WeeK1;

public class SlideMaxSum {

  public static void main(String[] args) {

    int[] arr = {1,3,4,2,6,5,7,5,2,8,1};
    int k = 4;
    int maxSum = 0;
    for (int i=0; i<arr.length-k; i++) {
//      System.out.println(arr[i]);
      int sumInt = 0;
      for (int j=i; j<i+k; j++) {
        sumInt+=arr[j];
      }
      if (maxSum < sumInt)
        maxSum = sumInt;
    }
    System.out.println("MAX is "+maxSum);
  }

}
