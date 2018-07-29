//date is entered as an input by the user and the month entered is replaced by its name

import java.util.*;
//import java.time.*;
//import java.text.*;
class FormatChange
{
	public static void main(String args[])
	{
		
		/*String start_dt = "09,07,2010";
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = (Date)formatter.parse(start_dt);
		SimpleDateFormat newFormat = new SimpleDateFormat("dd/M/yyyy");
		String finalString = newFormat.format(date);
		System.out.println(finalString);*/
		
		System.out.println("Enter a date in dd,MM,yyyy form");
		Scanner scanner = new Scanner(System.in);
		String date = scanner.nextLine();
		
		String[] dmyForm = date.split(",");
		System.out.print(dmyForm[0]+" / ");
		switch(dmyForm[1])
		{
			case "01": System.out.print("January");
						break;
						
			case "02": System.out.print("February");
						break;

			case "03": System.out.print("March");
						break;

			case "04": System.out.print("April");
						break;

			case "05": System.out.print("May");
						break;

			case "06": System.out.print("June");
						break;

			case "07": System.out.print("July");
						break;

			case "08": System.out.print("August");
						break;

			case "09": System.out.print("September");
						break;	
			
			case "10": System.out.print("October");
						break;
			
			case "11": System.out.print("November");
						break;
			
			case "12": System.out.print("December");
						break;
			
			default: System.out.print("Invalid month");
						break;						
						
		}
		System.out.print(" / "+dmyForm[2]);
	}
}