package bankaccountapp;

public class Checking extends Accounts {

	//list properties of checking account
	private int dbcard;
	private int pin; 
	//constructors to initialize checking account
	public Checking(String name,String sSN,double initdeposit) {
		super(name,sSN,initdeposit);
		accountNumber="2"+accountNumber;

		//System.out.println("new accountnumber is-"+this.accountNumber);
		//System.out.println("checking account ");
		setDebitcard();
		
	}
	
	private void setDebitcard() {
		dbcard=(int)(Math.random()*Math.pow(10, 12));
		pin=(int)(Math.random()*Math.pow(10, 4));
		//System.out.println("DEBIT CARD NUMBER-"+dbcard+"\nPIN-"+pin);


	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println("you are CHECKING the features of account"+"\nDEBIT CARD NUMBER - "+dbcard+"\nPIN -"+pin);
	}

	@Override
	public void setrate() {
		rate=getbaserate()*.15;
		//System.out.println("implements baserate for checking");
	}
	
	//list any methods to checking accounts
	
}
