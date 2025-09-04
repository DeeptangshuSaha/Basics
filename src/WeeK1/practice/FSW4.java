package WeeK1.practice;
import java.util.Deque;
import java.util.LinkedList;

public class FSW4 {
    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        Deque<Integer> dq = new LinkedList<>();
        for (int i=0; i<arr.length; i++) {
            //First eliminate the out of window indices
            while (!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }
            //Then check if the last element is less than the current index
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.add(i);

            if (i >= k-1) {
                System.out.print(arr[dq.peekFirst()]+" ");
            }
        }
    }
}
