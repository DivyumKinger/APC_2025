package July_2_2025.First;

// Other imports go here
// Do NOT change the class name
class Account{
	long id;
	String accountNumber;
	double balance;
	
	Account(long id, String accountNumber, double balance){
		this.id = id;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getID(){
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setAC(String accountNumber){
		this.accountNumber = accountNumber;
	}
	
	public void getAC(){
		System.out.println(accountNumber);
	}
	
	public void display(){
		System.out.println("ID: "+id);
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Balance: "+balance);
	}
}

class Customer{
	String name;
	Account account;
	
	public Customer(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public void display(){
		System.out.println("Name: "+name);
		account.display();
	}
}

class Main
{
	public static void main(String[] args)
	{
		Account account = new Account(1, "162662626", 100.00);
		System.out.println(account.toString());
		Customer customer = new Customer(account, "Mahesh");
		customer.display();
	}
}