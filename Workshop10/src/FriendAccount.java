public class FriendAccount extends Thread{
	 
	  private StrangeBank withdraw;
	  private int amount;
	 
	  public FriendAccount(StrangeBank x, int amount) {
	
		  super();
		withdraw = x;
		this.amount = amount;
		
	}
	public void run() {
		
		int val;
		
		do {
		
			try {
				Thread.sleep( (int) ( Math.random() * 3000 ) );
			
			} catch(InterruptedException e) {
				System.out.println(e.toString());
			}
			
			val = withdraw.withdrawAccount();
		} while (val != amount);
	
	}
		
	}