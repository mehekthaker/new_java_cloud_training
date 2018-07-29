//Write a Java assignment statement to calculate a 35% discount on an item’s value stored in the variable newItem, 
//store the discount amount in a variable called discount. 
//Then calculate the new price for the item subtracting off the discount, storing the new price in a variable called newItemPrice.

import java.util.*;

public class Discount {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the cost of the item");
		double new_item = scanner.nextDouble();
		double discount, newItemPrice=0;
		
		discount = 0.35 * new_item;
		newItemPrice = new_item - discount;
		System.out.println("The new amount is "+newItemPrice);
	}
}
