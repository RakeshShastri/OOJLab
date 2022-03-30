import java.util.*;
import java.lang.Math;
class Account {
	public String acc_name;
	public double acc_no;
	public int acc_type;
	public double balance;
	public void getdata(String name,double no,int type,double bal) {
		acc_name=name;
		acc_no=no;
		acc_type=type;
		balance=bal;
	}
}
class Savings extends Account {
	public void deposit(double amt) {
		balance=balance+amt;
		System.out.println(balance);
	}
	public void withdraw(double amt) {
		balance=balance-amt;
		System.out.println(balance);
	}
	public void interest(int time, int no, double r) {
		double a = 1 + r/no;
		double b = no*time;
		double c = Math.pow(a, b);
		balance = balance * c;
		System.out.println("The new balance is"+balance);
	}
}
class Current extends Account {
	public void deposit(double amt) {
		balance=balance+amt;
		System.out.println(balance);
	}
	public void withdraw(double amt) {
		balance=balance-amt;
		System.out.println(balance);
		check(balance);
	}
	public void check(double amt) {
		if(amt<10000) {
			balance =balance-500;
			System.out.println("Insufficient Balance "+balance);
		}
	}
}
class BankProgram {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int temp=1;
		while(temp==1) {
			double amt=0;
			System.out.println("Enter name");
			sc.next();
			String name=sc.nextLine();
			System.out.println("Enter acc_no");
			double no=sc.nextDouble();
			System.out.println("Enter acc_type\n0 for Savings\n1 for Current");
			int type=sc.nextInt();
			if(type==0) {
				Savings s=new Savings();
				s.getdata(name,no,type,amt);
				System.out.println("\n1.Deposit\n\2.Withdraw\n3.Interest");
				int choice=sc.nextInt();
				switch (choice) {
					case 1: System.out.println("Enter Amoumt");
							double depositeAmt=sc.nextDouble();
							s.deposit(depositeAmt);
							break;
					case 2: System.out.println("Enter Amoumt");
							double withdrawAmt=sc.nextDouble();
							s.withdraw(withdrawAmt);
							break;
					case 3: System.out.println("Enter time period");
							int tp=sc.nextInt();
							System.out.println("Enter Rate of Interest");
							double r = sc.nextDouble();
							double rate = r/100;
							System.out.println("Enter no of times per time period");
							int nof=sc.nextInt();
							s.interest(tp, nof, rate);
							break;
					default: System.out.println("invalid option");
							 break;
				}
			}
			else if(type==1) {
				System.out.println("Enter balance");
				amt=sc.nextDouble();
				Current c=new Current();
				c.getdata(name,no,type,amt);
				c.check(amt);
				System.out.println("\n1.Deposit\n\2.Withdraw");
				int choice=sc.nextInt();
				if(choice==1) {
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					c.deposit(amt1);
				}
				else if(choice==2) {
					System.out.println("Enter Amoumt");
					double amt1=sc.nextDouble();
					c.withdraw(amt1);
				}
			}
			System.out.println("To continue 1 else 0");
			temp=sc.nextInt();
		}
		sc.close();
	}
}

