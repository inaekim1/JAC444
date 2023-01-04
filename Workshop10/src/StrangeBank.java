
public class StrangeBank {

	private static int bal; 
	private String curr;
	
	
	public StrangeBank() {
		bal = 0;
		curr="";
	}

	public int getBalance() {
		return bal;
	}
	public String getCurrency() {
		return curr;
	}

	public void setCurrency(String currency) {
		this.curr = currency;
	}

	public void setBalance(int amount) {
		bal = amount; 
	}
	
	
	public synchronized void fundAccount(int amount, String currency) {
	   
		while(bal > 0) { 
	    	
	    	try { 
		
	    		System.out.println("Waiting untill friend withdraw...");
				wait();  
			
	    	} catch ( InterruptedException e ) { 
				e.printStackTrace();
			}
	    }
		
	    bal += amount;
	    this.curr=currency;
	    
		System.out.println("Amount is successfully Deposited in Account, new balance is " + getBalance() +" "+ getCurrency());
		
		notify(); 
		}
	
	public synchronized int withdrawAccount() {
		
		while(bal == 0) {   
		
			try { 
				System.out.println("Funds not available. Waiting for deposit...");
				wait();
			
			} catch (Throwable e) { 
			System.out.println(e.getMessage());
			}
		}
		
		bal -=1;
		System.err.println("Friend withdraw successfully, bank balance is " + getBalance()+"\n");
		notify(); 
	    return 1;
	}


	
}