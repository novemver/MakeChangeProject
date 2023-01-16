package app;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double itemPrice = 0.0, changeDue = 0.0, cashAmt = 0.0;
		String cashTendered = "";

		System.out.println("Enter item price: ");

		itemPrice = scan.nextDouble();
		scan.nextLine();

		System.out.println("You entered: $" + itemPrice);

		System.out.println("Enter cash amount: ");
		cashTendered = scan.next();
		scan.nextLine();
		System.out.println("You entered: $" + cashTendered);

		switch (cashTendered) {
		case "20":
		case "20.00":
			cashAmt = 20;
			changeDue = changeMaker(cashAmt, itemPrice);
			changeBill(changeDue);
			changeCent(changeDue);
			break;

		case "10":
		case "10.00":
			cashAmt = 10;
			changeMaker(cashAmt, itemPrice);
			changeBill(changeDue);
			changeCent(changeDue);
			break;
		case "5":
		case "5.00":
			cashAmt = 5;
			changeMaker(cashAmt, itemPrice);
			changeBill(changeDue);
			changeCent(changeDue);
			break;
		case "1":
		case "1.00":
			cashAmt = 1;
			changeMaker(cashAmt, itemPrice);
			changeBill(changeDue);
			changeCent(changeDue);
			break;
		case ".25":
		case "0.25":
			cashAmt = 0.25;
			changeMaker(cashAmt, itemPrice);
			changeCent(changeDue);
			break;
		case ".10":
		case "0.10":
		case ".1":
			cashAmt = 0.10;
			changeMaker(cashAmt, itemPrice);
			changeCent(changeDue);
			break;
		case "0.05":
		case ".05":
			cashAmt = 0.05;
			changeMaker(cashAmt, itemPrice);
			changeCent(changeDue);
			break;
		case "0.01":
		case ".01":
			cashAmt = 0.01;
			changeMaker(cashAmt, itemPrice);
			changeCent(changeDue);
			break;

		default:
			System.out.println(" Error, please try again. ");
			break;
		}
		scan.close();
	}

//	Methods

	public static void changeBill(double changeDue) {
		double tens = changeDue / 10;
		if (tens > 0) {
			tens = Math.floor(tens);
			System.out.print(tens + " ten dollar bill, ");
		}

		changeDue = changeDue % 10;
		double fives = changeDue / 5;
		if (fives > 0) {
			fives = Math.floor(fives);
			System.out.print(fives + " five dollar bill, ");
		}
		changeDue = changeDue % 5;
		double ones = changeDue / 1;
		if (ones > 0) {
			ones = Math.floor(tens);
			System.out.print(ones + " one dollar bills, ");
		}
	}

	public static void changeCent(double changeDue) {
		double quarters = 0, dimes = 0, nickels = 0, pennies = 0;

		double cents = Math.floor(changeDue);
		cents = cents * 100;

		if (cents >= 25) {
			quarters = cents / 25;
			System.out.print(Math.floor(quarters) + " quarters, ");
		} else if (cents >= 10) {
			dimes = cents / 10;
			System.out.print(Math.floor(dimes) + " dimes, ");
		} else if (cents >= 5) {
			nickels = cents / 5;
			System.out.print(Math.floor(nickels) + " nickels, ");
		} else if (cents >= 1) {
			pennies = cents / 1;
			System.out.print(Math.floor(pennies) + " pennies. ");
		}

	}

	public static double changeMaker(double cashAmt, double itemPrice) {

		double changeDue = cashAmt - itemPrice;
//		System.out.println("Amount: " + itemPrice + " Tendered: " + cashAmt);
		return changeDue;
	}
}
