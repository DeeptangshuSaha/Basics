package WeeK1;
import java.util.HashSet;
public class LongSubStrOpt {
    public static void main(String[] args) {
        String s = "pwwkew";
        int left=0, right=0, maxL=0;
        HashSet<Character> set = new HashSet<>();
        while ( right < s.length()) {
            char c = s.charAt(right);
            if (!set.contains(c)) {
                set.add(c);
                maxL = Math.max(maxL, right-left+1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println("Longest L: "+maxL);
    }
}
