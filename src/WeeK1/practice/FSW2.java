package WeeK1.practice;

public class FSW2 {
    public static void main(String[] args) {
        int[] inp = {2,1,5,1,3,2};
        int k = 2;
        int minSum, slideSum=0;
        for (int i=0; i<k; i++) {
            slideSum+=inp[i];
        }
        minSum = slideSum;
        for (int i=k; i<inp.length; i++){
            slideSum += inp[i] - inp[i-k];
            minSum = Math.min(minSum, slideSum);
        }

        System.out.println("MIN: "+minSum);
    }
}
