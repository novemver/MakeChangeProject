package lab;

public class hwlab {

	public static void main(String[] args) {

		public static double changeMaker(double cashAmt, double itemPrice) {

			double changeDue = cashAmt - itemPrice;
			System.out.println("Amount: " + itemPrice + "Tendered: " + cashAmt);
			return changeDue;
		}
	}
		public static void billFinder(double changeDue) {
			double bills = 0, singleBills = 0;
			String tenBill = "", fiveBill = "", oneBill = "";

 
			while (changeDue >= 10) {
				for (double i = changeDue; i > 15; i--) {
					bills += i;
				}

				tenBill = "1 ten dollar bill, ";

			}

			while (changeDue >= 15 || changeDue < 10) {

				fiveBill = "1 five dollar bill, ";
			}

			while (changeDue >= 15) {

				for (double i = changeDue; i > 15; i--) {
					singleBills += i;
					oneBill = " one dollar bills ";
				}
			while (changeDue < 5) {
					for (double k = changeDue; k > 0; k--) {
						singleBills += k;
						oneBill = " one dollar bills ";
					}

				}
				String result = tenBill + fiveBill + singleBills + oneBill;
				System.out.println(result);

}
