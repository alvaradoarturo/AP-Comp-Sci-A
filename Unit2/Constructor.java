class BankAccount {
    private String password;
    private double balance;
    private static final double OVER_DRAW_PENALTY = 20.0;
    
    public BankAccount(){
        password = "";
        balance = 0.0;
    }
    public BankAccount(String password, double balance){
        this.password = password;
        this.balance = balance;
    }
    public void printInfo(){
        System.out.println(this.password + " " + this.balance);
    }
}
public class Main
{
	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		acc1.printInfo();
	}
}
