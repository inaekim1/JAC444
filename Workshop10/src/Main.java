public class Main {
	
	private static int DOLLARS=1;
	private static int EUROS=2;
	private static int POUNDS=3;
	

	public static void main(String[] args) throws InterruptedException {
	
		StrangeBank account = new StrangeBank();
		
		Thread myAccount = new MyAccount(account, EUROS, DOLLARS, POUNDS);
		Thread friendAccount = new FriendAccount(account, 0);
		myAccount.start();
		friendAccount.start();
	 }

}