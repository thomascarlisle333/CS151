// This application program illustrates how to
// read text from the keyboard, and tests your
// Java version.

import java.util.Scanner;

public class TryApplication2 {

   public static void main (String[] args) {

      String text;
      Scanner scan = new Scanner (System.in);
      System.out.println();
      System.out.println("Type a line of text on the keyboard ");
      System.out.println("and press \"Enter\" when finished: ");
      System.out.println();
      text = scan.nextLine();
      System.out.println();
      System.out.println("The text you typed was: \"" + 
                     text + "\" ");
   }
}