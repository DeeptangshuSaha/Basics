package WeeK1;

import java.util.HashSet;

public class VariableWindow {
    public static void main(String[] args) {
        //Longest Substring without repeating chars
        String s = "pwwkew";
        int left=0, right=0, maxL=0;
        HashSet<Character> set = new HashSet<Character>();
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                maxL = Math.max(maxL, right-left+1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(maxL);
    }
}

