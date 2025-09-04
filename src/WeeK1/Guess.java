package WeeK1;

import java.util.Random;
import java.util.Scanner;

public class Guess {
  public static void main(String[] args) {
    Random random = new Random();
    int randNum = random.nextInt(100) + 1;
    System.out.println("Guess a Num b/w 1-100");
    Scanner sc = new Scanner(System.in);
    int ans = sc.nextInt();
    while (ans != randNum) {
      if (ans > randNum) {
        System.out.println("Go Lower");
      } else {
        System.out.println("Go Higher");
      }
      ans = sc.nextInt();
    }
    System.out.println("Yay you found "+randNum);
    sc.close();
  }
}
