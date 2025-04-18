/* This class provides the functionality to find the
   common Elements in two lists  */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsInTwoLists {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(20);

        list2.add(10);
        list2.add(200);
        list2.add(300);
        list2.add(400);
        list2.add(20);

        System.out.print("The Common Elements are: ");
        findingCommonElements(list1,list2);


    }
    private static void  findingCommonElements(List<Integer> list1, List<Integer> list2){
        Set<Integer> set1 = new HashSet<>(list1);
        Set <Integer> set2 = new HashSet<>(list2);
        List<Integer> list3 =new ArrayList<>();

        for(Integer l1:set1){
            for(Integer l2:set2){
                if(l1.equals(l2)){
                    list3.add(l1);
                }
            }

        }
        System.out.println(list3);


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
//		- if void used ✔
//		- if return a specific data type or complex type (class) then make sure return statement has the same.
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