package exercicio;

import exercicio.Account;
import java.util.Scanner;

public class AccountTest 
{
	//Var�avel que referencia a classe Scanner;
	private static Scanner ler;
	
	public static void main(String[] args) 
	{
		
		Account myAccount1 = new Account("Lucas Gabriel", 54.75);
		Account myAccount2 = new Account("Diego Gabriel", -1.74);
		
		ler = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja depoisitar na 2� Conta\n");
		double deposito = ler.nextDouble();
		myAccount2.deposit(deposito);
		
		System.out.print("Digite o valor que deseja retirar da 2� Conta \n");
		double retirada = ler.nextDouble();
		myAccount2.saque(retirada);
		
		Account.displayAccount(myAccount1);
		Account.displayAccount(myAccount2);
		
		//System.out.printf(Account.displayAccount(myAccount1));
		//System.out.print("O nome da sua conta e o Balan�o s�o: " + Account.displayAccount(myAccount1)); 
		//System.out.printf("O nome da sua conta �: %s  e o Balan�o �: $%.2f %n%n", myAccount2.getName(), myAccount2.getBalance());
		
	}

}
