/*This class provides the functionality to who is winner in between two player in
 rock paper scissor game
 */

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Enter player1 choice (Rock/Paper/Scissor): ");
            String player1Choice = scanner.nextLine().toLowerCase();
            System.out.print("Enter player2 choice (Rock/Paper/Scissor): ");
            String player2Choice = scanner.nextLine().toLowerCase();
            System.out.println(findingWinner(player1Choice, player2Choice));
            System.out.print("Do you want Play Again (Yes/No): ");
            String response =scanner.nextLine();
            if(!response.equals("yes")){
                break;
            }
        }

    }

    private static String findingWinner(String player1Choice, String player2Choice){
        if(player1Choice.equals(player2Choice)){
            System.out.println("Game is Tie");
        } else if (player1Choice.equals("rock") && player2Choice.equals("scissor")||((player1Choice.equals("scissor") && player2Choice.equals("paper"))|| player1Choice.equals("paper") && player2Choice.equals("rock"))) {
            return "player1 is winner.";

        }
        return "player 2 is winner";
    }
}


// Important code guidelines
//- Naming of files ✔
//	- (represent the purpose of the program)
//	- SHOULD NOT be a generic name ✔
//	- The name of the file should be readable for developers ✔
//	- For example:
//		- SeniorCitizenCalculator (CalculatorSeniorCitizen)
//	- No spelling Mistakes ✔
//	- Pascal case while naming ✔
//	- Use Noun first and if required use Verb later, but always first noun.


//- Naming of classes
//	- (represent the purpose of the program) ✔
//	- SHOULD NOT be a generic name ✔
//	- The name of the class should be readable for developers ✔
//	- For example:
//		- SeniorCitizenCalculator (this is not readable -> CalculatorSeniorCitizen)
//	- No spelling Mistakes ✔
//	- Pascal case while naming ✔
//	- Use Noun first and if required use Verb later, but always first noun. ✔
//	- Class level comments using /* */ ✔


//- Naming of methods
//	- - (represent the purpose of the program) ✔
//        - SHOULD NOT be a generic name ✔
//	- The name of the method should be readable for developers ✔
// 	- For methods that do operation - Use Verb first and then the noun (operation)
// 	- calculateAge() ✔
//	- for methods that return Boolean start with isSeniorCitizen
//	- determine if the method is return or not
//		- if void used
//		- if return a specific data type or complex type (class) then make sure return statement has the same. ✔
//        - is the method called from inside the class
//		- private (access modifier) ✔
//        - is the method called from the same package
//        - default
//	- is the method called by a class outside the package
//        - public


//	- determine if the method is an instance method or a static method
//		- instance methods - when an operation is done with object data
//Cat myCat = new Cat(); // myCat a reference to a Cat() object
//Cat yourCat = new Cat(); // another
//getColourOfCat();

//		- static method - when an operation is only doing some calculation
//		and not involving instance object data ✔
//			- arithmetic operation
//			- Logical operation
//			- operation not related to instance object
//public static isSeniorCitizen() {
//    if age > 60
//}
//call within the class/ outside with the need to create the object reference.
//
//
//
//
//-  Naming of variables
//    - global variables (instance members, fields)
//    - Method arguments / parameters ✔
//    - Local variables. ✔
