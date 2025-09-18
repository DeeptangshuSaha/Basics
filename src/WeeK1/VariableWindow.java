package WeeK1;

import java.util.HashSet;

public class VariableWindow {
  public static void main(String[] args) {
    //Longest Substring without repeating chars
//    String s = "ADOBECODEBANC", t = "ABC";
    String s = "abcdabcbb";
    int left = 0, right = 0, maxL = 0;
    HashSet<Character> set = new HashSet<>();
//    for (char c : t.toCharArray()) {
//      set.add(c);
//    }
//    System.out.println(set);
    while (right < s.length()) {
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

    System.out.println(maxL);
  }
}

