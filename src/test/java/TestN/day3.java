package TestN;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class day3 {
	
@Test

	public static void usermenu()
	{
		
	System.out.println(" before group navigate to usermenu");
	}
	
	@Test(groups= "Smoke")
	public static void Tshirts()
	
	{
		System.out.println("navigate to Tshirts page");
	}
	@AfterGroups("Smoke")
	public static void quantity() {
		System.out.println("After groupuser added the quantity");
	}
	
	@Test(groups= "Smoke")
	
		public static void addtocart() {
		System.out.println("added to cart");
	}
}
