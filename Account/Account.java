package exercicio;

public class Account {

	private String name;
	private double balance;
	private double retirada;
	
	public Account(String name, double balance) {
		this.name = name;
		
		if (balance > 0.0) 
			this.balance = balance;
		
	}
	
	public void deposit(double deposito) {
		if (deposito > 0.0) 
			balance = balance + deposito;
		
	}
	
	public void saque(double retirada) {
		if(retirada < balance)
			balance = balance - retirada;
		else 
			System.out.println("O valor de saque solitado exede a quantia que tem na conta");
	}
	
	
	public double getBalance() {
		return balance;
	}
	
	public double getSaque() {
		return retirada;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void  displayAccount(Account displayAccount) {
		
		System.out.printf("Nome da Conta é: %s e o Balanço é: $%.2f %n",displayAccount.getName(), displayAccount.getBalance() );
	}
}
