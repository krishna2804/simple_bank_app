package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checking chacc1=new Checking("james","123456987",1860);
		
		Savings savcc1=new Savings("ram mohan","421685979",1450);
		
		chacc1.showinfo();
		System.out.println("---------------------------------------------");
		savcc1.compound();

		savcc1.showinfo();
		savcc1.deposit(5000);
		savcc1.withdraw(2150);
		savcc1.transfer("ravi",2000);
		
		
		//read CSV file and create accounts based on that data
		

	}

}
