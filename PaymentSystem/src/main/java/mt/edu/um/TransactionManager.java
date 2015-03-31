package mt.edu.um;

public class TransactionManager extends Transaction {
	
	private int numTransactionsProcessed;
	
	public boolean processTransaction(int src){
		return true;
	}
	
	public void setNumTransactionsProcessed(){
		
	}
	
	public int getNumTransactionsProcessed(){
		return numTransactionsProcessed;
	}

}
