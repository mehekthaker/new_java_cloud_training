/*5)	Provide  marks of three subject and declare the result, result declaration is based on  below conditions:
Condition 1: -All subjects marks is greater than 60 is Passed 
Condition 2: -Any two subjects marks is greater than 60 is Promoted
Condition 3: -Any one subject marks is greater than 60 or all subjects’ marks less than 60 is failed.*/


import java.util.*;
class Result{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks for Physics");
		int phy_marks=sc.nextInt();
		
		System.out.println("Enter marks for Chemistry");
		int chm_marks=sc.nextInt();
		
		System.out.println("Enter marks for Maths");
		int math_marks=sc.nextInt();
		
		
		//checking all the conditions
		if(phy_marks>60 && chm_marks>60 && math_marks>60){
			System.out.println("Passed");
		}
		else if(phy_marks>60 && chm_marks>60 || chm_marks>60 && math_marks>60 || math_marks>60 && phy_marks>60){
			System.out.println("Promoted");
		}
		else
			System.out.println("Failed");
		
	}

}