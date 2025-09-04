package WeeK1.practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class FSW3 {
    public static void main(String[] args) {
//        int[] inp = {12, -1, -7, 8, -15, 30, 16, 28};
        int[] inp = {-1,-2,3,4,5,6};
        int k = 3;
        Deque<Integer> dq = new LinkedList<Integer>();
        for (int i=0; i<inp.length; i++) {
            //First eliminate the old indices
            while (!dq.isEmpty() && dq.peekFirst() <= i-k) {
                dq.pollFirst();
            }

            if (inp[i] < 0)
                dq.add(i);

            if (i >= k-1) {
                if (!dq.isEmpty())
                    System.out.print(inp[dq.peekFirst()]+" ");
                else
                    System.out.print("0 ");
            }
        }
    }
}
