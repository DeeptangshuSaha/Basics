package WeeK1.practice;
public class FSW1 {
    public static void main(String[] args) {
        int[] inp = {2,1,5,1,3,2};
        int k = 3;
        int maxmSum, slideSum=0;
        for (int i=0; i<k; i++) {
            slideSum+=inp[i];
        }
        maxmSum = slideSum;
        for (int i=k; i<inp.length; i++){
            slideSum += inp[i] - inp[i-k];
            maxmSum = Math.max(maxmSum, slideSum);
        }

        System.out.println("MAX: "+maxmSum);
    }
}
