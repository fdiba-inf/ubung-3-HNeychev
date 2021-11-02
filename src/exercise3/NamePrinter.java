package exercise3;

import java.util.Scanner;

public class NamePrinter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String letter = input.nextLine();
      
    for (int index = 0; index < letter.length (); index++){
      char symbol = letter.charAt(index);
      System.out.println ("* " + symbol + " *");
    }

    }


}
