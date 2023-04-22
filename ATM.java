import java.util.Scanner;
import java.text.*;

public class ATM{
	public static void main(String[] args) {

		//Declare variables
		double balance = 0.00;
		double deposit, withdraw;
		int option;

		//An object named input of type class Scanner is being created
		Scanner input = new Scanner(System.in);
		//Format decimal numbers into 2 decimal points
		DecimalFormat f = new DecimalFormat("0.00");

		//Keep printing the menu and perform the tasks corresponded to different options. Stop printing the menu when the user chooses option 4 to exit. 
		do{
			System.out.println("1. View your Balance\n2. Deposit Cash\n3. Withdraw Cash\n4. Exit\n");
			System.out.print("Enter you selection: ");
			option = input.nextInt();

				if (option == 1){
					System.out.println("\nYour current balance is " + f.format(balance));
				}
				else if (option == 2){
					System.out.print("\n" + "Enter the amount you want to deposit: ");
					deposit = input.nextDouble();
					if (deposit >= 0)
						balance += deposit;
					else
						System.out.println(" Sorry you entered an invalid value!");
				}
				else if (option == 3){
					System.out.print("\n" + "Enter the amount you want to withdraw: ");
					withdraw = input.nextDouble();
					if (withdraw <= balance)
						balance -= withdraw;
					else
						System.out.println(" Sorry you don't have enough balance!");
				}

		}while(option != 4);

		//At the end of the transaction, print out "Goodbye"
		System.out.println("\n" + "Goodbye");

	//Close the Scanner input
	input.close();
	}




}
