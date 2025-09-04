package WeeK1;

public class LongSubStr {

  public static boolean unique(String str) {
    for (int i=0; i<str.length(); i++) {
        for (int j=i+1; j<str.length(); j++) {
            if (str.charAt(i) == str.charAt(j)) {
                return false;
            }
        }
    }
    return true;
  }
  public static void main(String[] args) {
    String s = "pwwkew";
    String subSTR = "";
    s = s.toLowerCase();
    int maxL = 0;
    for (int i=0; i<s.length(); i++) {
      for (int j=i; j<=s.length(); j++) {
        String sub = s.substring(i, j);
        if (unique(sub)){
          maxL = Math.max(maxL, sub.length());
          subSTR = sub;
        }
      }
    }
    System.out.println(maxL+" "+subSTR);
//    System.out.println(maxLS);
  }

}
