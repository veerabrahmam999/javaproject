/* This Class provides the functionality in which year that the person
      will get 100 years
 */

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class YearsCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Current age: ");
        int currentAge= scanner.nextInt();
        System.out.print("You will reach 100 at: "+findingYear(currentAge));

    }
    private static int findingYear( int currentAge){
        int difference=100-currentAge;
        int result = LocalDate.now().getYear()+difference;


        return result;
    }
}
