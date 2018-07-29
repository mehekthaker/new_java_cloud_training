import java.util.*;
class IncomeTax{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the CTC");
		int CTC = sc.nextInt();
		double tax;
		
		//checking all the conditions and then calculating the tax accordingly
		if(CTC>0 && CTC<=1_80_000)
		{
			System.out.println("Tax payable is null");
		}
		if(CTC>1_81_001 && CTC<=3_00_000)
		{
			tax = 0.1 * (double) CTC;
			System.out.println("Tax payable is " +tax);
		}
		if(CTC>3_00_001 && CTC<=5_00_000)
		{
			tax = 0.2 * (double) CTC;
			System.out.println("Tax payable is " +tax);
		}
		if(CTC>5_00_001 && CTC<=10_00_000)
		{
			tax = 0.3 * (double) CTC;
			System.out.println("Tax payable is " +tax);
		}
				
}
}		