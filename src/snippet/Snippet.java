package snippet;

import java.util.Scanner;

public class Snippet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number 1: " );
		int num1 = sc.nextInt();
		sc.nextLine();
		
		System.out.print("first name: ");
		String firstName = sc.nextLine();
		
		System.out.print("Enter a number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("num1 [" + num1 +
				            "], firstName " + firstName +
				            "], num2[" + num2 +"]");
}

}