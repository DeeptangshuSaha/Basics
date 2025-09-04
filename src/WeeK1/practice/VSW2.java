package WeeK1.practice;

import java.util.Arrays;
import java.util.HashSet;

public class VSW2 {
     public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        HashSet<Character> set = new HashSet<Character>();
        for (char c: t.toCharArray()){
            set.add(c);
        }
        // System.out.println(set);
        int left=0, right=0, minL = Integer.MAX_VALUE, sliL = 0;
        HashSet<Character> loopSet = new HashSet<Character>(set);
        while (left <= s.length()-t.length()) {
            char c = s.charAt(right);
            if ( !loopSet.isEmpty() ){
                if (loopSet.contains(c)) {
                    loopSet.remove(c);
                    System.out.println(loopSet);
                    sliL++;
                    right++;
                }
            } else {
                minL = Math.min(minL, right-left + 1);
                loopSet = new HashSet<Character>(set);
                left++;
            }
        }
        // System.out.println(minL);
    }
}
