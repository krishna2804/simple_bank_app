package bankaccountapp;

public interface Interestrate {

	//method to write baserate 
	default double getbaserate() {
		return 2.5;
	}
	
}
