import java.util.Scanner;
public class Atm_Machine 
{
	static Scanner sc=new Scanner(System.in);
	static int withdraw,deposit,balance;
	public static void main(String[]args)
	{    
		int pin=2023;
		System.out.println("Please enter your Pin: ");
		int userPin=sc.nextInt();

	  if(userPin == pin)
		{
		  System.out.println("Hello,Teja");
            
		 for(int i=0;i<=5;i++)
	      {
		System.out.println("Welcome to the ATM Machine");
		System.out.println("Enter 1 for Withdraw");
        System.out.println("Enter 2 for Deposit");
		System.out.println("Enter 3 for Check Balance");
		System.out.println("Enter 4 for EXIT");
		 int n=sc.nextInt();
		 
	    
	switch(n)
		{
		case 1:
			System.out.println("Enter money to be withdraw:");
			 withdraw=sc.nextInt();

			if(balance>=withdraw)
			{
			   balance=balance-withdraw; 
			   System.out.println("Please collect your cash");
			}
			else{
				System.out.println("Insufficient Balance");
		          }
			     break;
		case 2:
			System.out.println("Enter money to be deposited:");
			deposit=sc.nextInt();
		    balance=balance+deposit;
			System.out.println("Your Money has been successfully deposited");
			break;
	
		case 3:
			System.out.println("Check your balance");
		    balance=deposit-withdraw;
		    System.out.println("Deposit:"+deposit);
			System.out.println("Withdraw:"+withdraw);
			System.out.println("Balance:"+balance);
		    break;
		case 4:
			System.exit(0);
		   
		}
	 }
	 }else{
		   System.out.println("Invalid Pin");
		    }
  }
}
