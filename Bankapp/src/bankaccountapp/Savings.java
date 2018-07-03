package bankaccountapp;

public class Savings extends Accounts {
	
	//list properties of saving account
	private int safetyDepositboxID;
	private int safetyboxKEY;
	//constructors to initialize saving account
	public Savings(String name,String sSN,double initdeposit) {
		super(name,sSN,initdeposit);
		accountNumber="1"+accountNumber;
		//System.out.println("new accountnumber is-"+this.accountNumber);
		//System.out.println("savings account");
		setSafetybox();
	}
	
	private void setSafetybox() {
		safetyDepositboxID=(int)(Math.random()*Math.pow(10, 3));
		safetyboxKEY=(int)(Math.random()*Math.pow(10, 4));

	}
	
	@Override
	public void setrate() {
		//System.out.println("implements baserate for savings");
		rate=getbaserate()-.25;

	}
	
	public void showinfo() {
		super.showinfo();
		System.out.println("Account type:SAVING");
		System.out.println("your banking features are:"+
		"\nsafety Deposit box ID ="+safetyDepositboxID+
		"\nsafety deposit box KEY ="+safetyboxKEY);

	}

	

	
	//list any methods to saving accounts
		

}
