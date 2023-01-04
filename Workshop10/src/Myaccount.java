public class MyAccount extends Thread{
 
	
	private StrangeBank deposit;
	private int euro, dollar, pound;

	
	public MyAccount(StrangeBank x, int euro, int dollar, int pound) {
		
		super();
		this.deposit = x;
		
		this.euro=euro;
		this.dollar= dollar;
		this.pound=pound;
	}
	
	public synchronized void run() {
		
		while(true) {
			
			try {
				Thread.sleep( (int) ( Math.random() * 1500 ) );
			} catch(InterruptedException e) {
				System.out.println(e.toString());
			}
			
			if(euro > 0) { 
			deposit.fundAccount(euro , "euro");
			euro--;
			
			} else if(dollar > 0) { 
				deposit.fundAccount(dollar , "dollar");
				dollar--;
			
			} else if(pound > 0) { 
				deposit.fundAccount(pound , "pound");
				pound--;
			
			} else {
				return;
			}
		}
	}
}