package exercicio;

import exercicio.Account;
import java.util.Scanner;

public class AccountTest 
{
	//Varíavel que referencia a classe Scanner;
	private static Scanner ler;
	
	public static void main(String[] args) 
	{
		
		Account myAccount1 = new Account("Lucas Gabriel", 54.75);
		Account myAccount2 = new Account("Diego Gabriel", -1.74);
		
		ler = new Scanner(System.in);
		
		System.out.print("Digite o valor que deseja depoisitar na 2ª Conta\n");
		double deposito = ler.nextDouble();
		myAccount2.deposit(deposito);
		
		System.out.print("Digite o valor que deseja retirar da 2ª Conta \n");
		double retirada = ler.nextDouble();
		myAccount2.saque(retirada);
		
		Account.displayAccount(myAccount1);
		Account.displayAccount(myAccount2);
		
		//System.out.printf(Account.displayAccount(myAccount1));
		//System.out.print("O nome da sua conta e o Balanço são: " + Account.displayAccount(myAccount1)); 
		//System.out.printf("O nome da sua conta é: %s  e o Balanço é: $%.2f %n%n", myAccount2.getName(), myAccount2.getBalance());
		
	}

}
