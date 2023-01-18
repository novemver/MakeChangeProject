package lab;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double price = 0.0, cashTendered = 0.0, changeDue = 0.0;
		

		System.out.println("Enter item price: ");

		price = scan.nextDouble();
		scan.nextLine();

		System.out.println("You entered: $" + price);

		System.out.println("Enter cash amount: ");
		cashTendered = scan.nextDouble();
		scan.nextLine();
		System.out.println("You entered: $" + cashTendered);

	
		scan.close();
		
		changeDue = changeMaker(price, cashTendered);
		
//		if  (cashTendered > price) {
//			
//		}
		changeBill(changeDue);
		changeCent(changeDue);
	}

	// Methods

	public static void changeBill(double changeDue) {
		System.out.println("change: " + changeDue);
		changeDue = changeDue % 20;
		double tens = changeDue / 10;
		
		if (tens == 0) {
			System.out.print("");
		} else if (tens > 1) {
			tens = Math.floor(tens);
			System.out.print((int) tens + " ten dollar bill, ");
		}

		changeDue = changeDue % 10;
		double fives = changeDue / 5;
		if (fives == 0) {
			System.out.println("");
		} else {
			fives = Math.floor(fives);
			System.out.print((int) fives + " five dollar bill, ");
		}
		changeDue = changeDue % 5;
		double ones = changeDue / 1;
		if (ones == 0) {
			System.out.print("");
		} else if (ones < 2) {
			ones = Math.floor(ones);
			System.out.print((int) ones + " one dollar bill, ");
		} else {
			System.out.print((int) ones + " one dollar bills, ");

		}
	}

	public static void changeCent(double changeDue) {
		double quarters = 0, dimes = 0, nickels = 0, pennies = 0;

		double cents = changeDue - (Math.floor(changeDue));
//		System.out.println(cents + "hi");
		cents = cents * 100;
		cents = Math.round(cents);
		System.out.println((int)cents);

		quarters = (cents / 25);
		quarters = Math.floor(quarters);
		if (cents < 25) {
			System.out.print("");
			
		} else if (cents >= 50) {
			System.out.print((int) quarters + " quarters, ");
		} else if (cents < 50 && quarters >= 25) {
			System.out.print((int) quarters + " quarter, ");
		} else {

			System.out.print("");
		}
		cents = cents % 25;
		dimes = cents / 10;
		
		if (cents < 10) {
			System.out.print("");
			
		} else if (cents <= 1) {
			System.out.print((int) dimes + " dimes, ");
		} else  {
			System.out.print((int) dimes + " dime, ");
		}
		
		cents = cents % 10;
		nickels = cents / 5;
		
		if (cents < 5) {
			System.out.print("");
			
		} else if (cents > 5) {
			System.out.print((int) nickels + " nickels, ");
		} else  {
			System.out.print((int) nickels + " nickel, ");
		}
			
		
		
		cents = cents % 5;
		pennies = cents / 1;
		if (cents < 0) {
			System.out.print("");
		} else if (cents > 1) {
//			cents = Math.floor(cents);
			System.out.print((int) pennies + " pennies. ");
		} else {
			System.out.print((int) pennies + " penny. ");
		}
	}
//	{
//		dimes = cents / 10;
//		System.out.print(Math.floor(dimes) + " dimes, ");
//	}else if(cents>=5)
//	{
//		nickels = cents / 5;
//		System.out.print(Math.floor(nickels) + " nickels, ");
//	}else if(cents>=1)
//	{
//		pennies = cents / 1;
//		System.out.print(Math.floor(pennies) + " pennies. ");
//	}
//
//	}

	public static double changeMaker(double price, double cashTendered) {

		double changeDue = price - cashTendered;
		// System.out.println("Amount: " + itemPrice + " Tendered: " + cashAmt);
		return changeDue;
	}
	}


