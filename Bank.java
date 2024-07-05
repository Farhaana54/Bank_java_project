package ex1;
import java.util.*;
class Bank{
	String name;
	long phoneno;
	int amount;
	int bal;
	void accountcreation(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Name:");
		name=s.nextLine();
		System.out.println("Phone number:");
		phoneno=s.nextLong();
		System.out.println("Initial Amount:"); 
		amount=s.nextInt();
		this.name=name;
		this.phoneno=phoneno;
		this.amount=amount;
		System.out.println(name);
		System.out.println(phoneno);
		System.out.println(amount);
	}
	void withdraw(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount you want to withdraw: ");
		int wdamount=sc.nextInt();
		if(this.amount-wdamount>=500) {
			this.bal=this.amount-wdamount;
			System.out.println("You have withdrawn Rs."+wdamount);
			System.out.println("Your balance is Rs."+bal);
		}
		else {
			System.out.println("Check Your Minimum balance");
		}
	}
	void deposit() {
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the amount you want to deposit: ");
		int damount=sd.nextInt();
		int balance=this.bal+damount;
		System.out.println("You have Deposited Rs."+damount);
		System.out.println("Your balance is Rs."+balance);
	}
	}



public class ex1 {

	public static void main(String[] args) {
	   Bank b=new Bank();
	   
	   Scanner c=new Scanner(System.in);
	   while(true) {
		 System.out.println("-------------------------------------------------------------------------------------");
	   System.out.println("\n\n1.Account creation\n2.Withdraw Amount\n3.Deposit Amount\n4.Exit\nEnter your Choice:");
	   int choice=c.nextInt();
	   switch(choice){
		   case 1: 
			   b.accountcreation();
			   break;
		   case 2:
			   b.withdraw();
			   break;
		   case 3:
			   b.deposit();
			   break;
		   case 4:
			   System.out.println("You have Exited");
			   break;
		   default:
			   System.out.println("Invalid option");   
	   }
	   
	   
	   }
	  
	}

}
