import java.util.Scanner;
import java.text.*;

public class ATM {

	public static void main(String[] args) {
		
		//Declare variables
		double bal = 0.00;
		double dep, with;
		int option;
		
		//An object named input of type class Scanner is being created
		Scanner input = new Scanner(System.in);
		
		//Keep printing the menu and perform the tasks corresponded to different options. Stop printing the menu when the user chooses option 4 to exit. 
		do {
			System.out.println("1. View your Balance\n2. Deposit Cash\n3. Withdraw Cash\n4. Exit\n");
			System.out.print("Enter you selection: ");
			option = input.nextInt();
			
			//If the user chooses option 1, print out the current balance
			if (option==1)
				balance(bal);
			//If the user chooses option 2, let the user enter the amount they want to deposit
			else if (option==2) {
				System.out.print("\n" + "Enter the amount you want to deposit: ");
				dep = input.nextDouble();
				//If deposit amount is greater than and equal to 0, add the deposit amount to balance
				if (dep>=0)
					bal = deposit(bal, dep);
				//If deposit amount is smaller than 0, print out the message below
				else
					System.out.println(" Sorry you entered an invalid value!");
			//If the user chooses option 3, let the user enter the amount they want to withdraw
			}else if (option==3) {
				System.out.print("\n" + "Enter the amount you want to withdraw: ");
				with = input.nextDouble();
				//If withdraw amount is less than and equal to current balance, minus the withdraw amount from balance
				if (with <= bal)
					bal = withdraw(bal, with);
				//If withdraw amount is greater than current balance, print out the message below
				else
					System.out.println(" Sorry you don't have enough balance!");
			}
		//If the user chooses option 4, quit the kiosk
		}while (option!=4);
		
		//At the end of the transaction, print out "Goodbye"
		System.out.println("\n" + "Goodbye");
		
		//Close the Scanner input
		input.close();

	}
	
	public static void balance(double x) {
		//Format decimal numbers into 2 decimal points
		DecimalFormat f = new DecimalFormat("0.00");
		//Print out current balance
		System.out.println("\nYour current balance is " + f.format(x));
	}
	
	public static double deposit(double x, double y) {
		//Add the deposit amount to balance
		x += y;
		return x;
	}
	
	public static double withdraw(double x, double y) {
		//Minus the withdraw amount from balance
		x -= y;
		return x;
	}

}
