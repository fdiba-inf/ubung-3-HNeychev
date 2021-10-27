package exercise3;
import java.lang.Math;
import java.util.Scanner;

public class AngleCalculation {
  public static void main(String[] args) {

Scanner input = new Scanner(System.in); 
    char type ;
    double value ;

    do{
      System.out.println("Enter value: ");
      value = input.nextDouble();
      System.out.println("Enter type: ");
      type = input.next().charAt(0);

      if (type == 'r'){
        double convertedValue = value / Math.PI * 180;
        System.out.println("Angel: " + convertedValue + 'd');

      }else if (type == 'r'){
        double convertedValue = value * Math.PI / 180;
        System.out.println("Angle:" + convertedValue + 'r');
      }
    }while(type == 'r' || type == 'd' );
    
    }

}