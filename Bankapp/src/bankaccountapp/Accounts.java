package bankaccountapp;

public abstract class Accounts implements Interestrate {
//common properties of both saving and checking

	String name;
	String sSN;
	String accountNumber;
	double balance;
	double rate;
	static int index=10000;
//constructors to set base properties and initialize the account
	public Accounts(String name,String sSN,double initdeposit) {
		this.name=name;
		this.sSN=sSN;
		balance=initdeposit;
		index++;
		double rate;
		//System.out.println("NAME: "+name+" SSN-"+sSN+" balance"+balance);
		//System.out.print("new account type created is-");
		this.accountNumber=setAccountnumber();
		//System.out.println("new accountnumber is-"+this.accountNumber);
		setrate();
		}
	
	

	public abstract void setrate();
	public void compound() {
		double accuiredIntrest=balance*(rate/100);
		balance=balance+accuiredIntrest;
		System.out.println("Accuired balance is - "+accuiredIntrest);
		//printbalance();
	}
	
	private String setAccountnumber() {
		String lasttwoSSN=sSN.substring(sSN.length()-2, sSN.length());
		int uniqueid=index;
		int randomnumber=(int)(Math.random()*Math.pow(10,3));
		return lasttwoSSN+uniqueid+randomnumber;
	}
	
	//set account number 
	
	
	//list common methods
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Amount deposited -"+amount);
		System.out.println("----Balance is--");
		printbalance();
		System.out.println("---------------------------------------");

		
	}
	
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("Amount withdrawn - "+amount);

		System.out.println("---------------Balance is-----------------");
		printbalance();
		System.out.println("---------------------------------------");

				
	}
	
	public void transfer(String towhom,double amount) {
		balance=balance-amount;
		System.out.println("you transfered "+amount+" to "+ towhom);

		System.out.println("---------Balance is-----------------");
		printbalance();
		System.out.println("---------------------------------------");

				
	}
	public void printbalance() {
		System.out.println(balance);
		
	}
	
	public void showinfo() {
		System.out.println("NAME: "+name
				+" \nSSN-"+sSN+" \nbalance"+balance+"\nrate -"+rate+"%");

		//System.out.print("new account type created is-");
		
	}
	
	
}
