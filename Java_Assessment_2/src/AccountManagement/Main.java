package AccountManagement;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Account ID: ");
		int Aid = sc.nextInt();

		System.out.print("Enter the Customer ID: ");
		int Cid = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter the Customer Name: ");
		String name = sc.nextLine();

		System.out.print("Enter the Customer Gender: ");
		char gender = sc.next().charAt(0);

		System.out.print("Enter the Account Balance: ");
		double balance = sc.nextDouble();

		Customer c = new Customer(Cid, name, gender);
		Account a = new Account(Aid, c, balance);

		boolean isRunning = true;
		while (isRunning) {
			System.out.println("----------------------------------");
			System.out.println("PLEASE SELECT ONE OPTION FROM BELOW: \n1.WITHDRAW\n2.DEPOSIT\n3.CHECK BALANCE\n4.EXIT\n----------------------------------");
			System.out.print("OPTION: ");
			int choice = sc.nextInt();

			if (choice == 1) {
				System.out.print("Enter the Amount to Withdraw: ");
				double amount = sc.nextDouble();
				a.withDraw(amount);
			} else if (choice == 2) {
				System.out.print("Enter the Amount to Deposit: ");
				double amount = sc.nextDouble();
				a.deposit(amount);
			} else if (choice == 3) {
				System.out.println("Current Balance: " + a.getBalance());
			} else if (choice == 4) {
				System.out.println("Thank You For Banking With Us!!");
				isRunning = false;
			} else {
				System.out.println("Invalid Choice");
			}
		}

	}

}
