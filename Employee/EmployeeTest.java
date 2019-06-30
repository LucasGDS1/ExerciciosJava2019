package exercicio;

import exercicio.Employee;
import java.util.Scanner;

public class EmployeeTest {

	private static Scanner ler;
	
	public static void main(String[] args) {
		
		Employee operario1 = new Employee("Lucas", "Gabriel", 0.0);
		Employee operario2 = new Employee("Teste", "Monstro", 1400);
		
		double aumento = 10.0 / 100.0;
	
		System.out.println("O valor atual do salário do Operario1 é = R$ " + operario1.getSalario());
		System.out.println("\nO valor atual do salário do Operario2 é = R$ " + operario2.getSalario());
		
		System.out.println("\nOs operarios ganharam o seguinte valor de aumento: " + aumento + "%"
				+ " ou seja 10%");
		
		//Chama o método para atribuir ao salários dos operários o aumento de 10%
		operario1.aumento(aumento);
		operario2.aumento(aumento);
		
		System.out.printf("%nNovo salário dos operários: %n");
		System.out.printf("%nSalário do %s = $%.2f", operario1.getNome(), operario1.getSalario());
		System.out.printf("%nSalário do %s = $%.2f", operario2.getNome(), operario2.getSalario());
	}

	
	public Scanner getLer() {
		return ler;
	}
}
