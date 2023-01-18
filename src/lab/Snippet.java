package lab;

import java.util.Scanner;

public class Snippet {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double price = 0.0, changeDue = 0.0, cashAmt = 0.0;
		double cashTendered = 0;

		System.out.println("Enter item price: ");

		price = scan.nextDouble();
		scan.nextLine();

//		System.out.println("You entered: $" + price);

		System.out.println("Enter cash amount: ");
		cashTendered = scan.nextDouble();
		scan.nextLine();
//		System.out.println("You entered: $" + cashTendered);

		changeDue = cashTendered - price;
		int billChange = (int) changeDue;
		
		double coins = changeDue - billChange;
		coins = (coins * 100) + .05;
		int coinChange = (int) coins;
				
		System.out.print(" Amount: " + price + " ");	
		System.out.print(" Tendered: " + (int)cashTendered + " Result: ");
		
	if (changeDue >= 1)	{
		changeBill(billChange);
		changeCent(coinChange);
	} else if (changeDue < 1 && changeDue > 0) {
		changeCent(coinChange);
		scan.close();
	} else {
	System.out.println("Error, please try again. ");
	}
	
	scan.close();
	}

	// Methods

	public static void changeBill(double billChange) {
//		System.out.println("change: " + billChange);
		billChange = billChange % 20;
		double tens = billChange / 10;
		if (tens == 0) {
			System.out.print("");
		} else if (tens > 1) {
			tens = Math.floor(tens);
			System.out.print((int) tens + " ten dollar bill, ");
		}

		billChange = billChange % 10;
		double fives = billChange / 5;
		if (fives == 0) {
			System.out.println("");
		} else if (fives >= 1){
			fives = Math.floor(fives);
			System.out.print((int) fives + " five dollar bill, ");
		} else {
			System.out.println(" ");
		}
		billChange = billChange % 5;
		double ones = billChange / 1;
		if (ones == 0) {
			System.out.print("");
		} else if (ones < 2) {
			ones = Math.floor(ones);
			System.out.print((int) ones + " one dollar bill, ");
		} else {
			System.out.print((int) ones + " one dollar bills, ");

		}
	}

	public static void changeCent(double coinChange) {
		double quarters = 0, dimes = 0, nickels = 0, pennies = 0;
	
		coinChange = (int) coinChange;

		quarters = (coinChange / 25);
		if (coinChange < 25) {
			System.out.print("");
			
		} else if (coinChange >= 50) {
			System.out.print((int) quarters + " quarters, ");
		} else if (coinChange < 50 && coinChange >= 25) {
			System.out.print((int) quarters + " quarter, ");
		} else {

			System.out.print("");
		}
		coinChange = coinChange % 25;
		dimes = coinChange / 10;
//		System.out.println(dimes);
//		System.out.println(cents);
		if (dimes < 1) {
			System.out.print("");
			
		} else if (dimes > 1) {
			System.out.print((int) dimes + " dimes, ");
		} else  {
			System.out.print((int) dimes + " dime, ");
		}
		
		coinChange = coinChange % 10;
		nickels = coinChange / 5;
	
		if (coinChange < 5) {
			System.out.print("");
			
		} else if (coinChange > 5) {
			System.out.print((int) nickels + " nickels, ");
		} else  {
			System.out.print((int) nickels + " nickel, ");
		}
			
		
		 
		coinChange = coinChange % 5;
		pennies = coinChange / 1;
		if (coinChange < 0) {
			System.out.print("");
		} else if (coinChange > 1) {
//			cents = Math.floor(cents);
			System.out.print((int) pennies + " pennies. ");
		} else {
			System.out.print((int) pennies + " penny. ");
		}
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

