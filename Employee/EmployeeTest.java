package exercicio;

import exercicio.Employee;
import java.util.Scanner;

public class EmployeeTest {

	private static Scanner ler;
	
	public static void main(String[] args) {
		
		Employee operario1 = new Employee("Lucas", "Gabriel", 0.0);
		Employee operario2 = new Employee("Teste", "Monstro", 1400);
		
		double aumento = 10.0 / 100.0;
	
		System.out.println("O valor atual do sal�rio do Operario1 � = R$ " + operario1.getSalario());
		System.out.println("\nO valor atual do sal�rio do Operario2 � = R$ " + operario2.getSalario());
		
		System.out.println("\nOs operarios ganharam o seguinte valor de aumento: " + aumento + "%"
				+ " ou seja 10%");
		
		//Chama o m�todo para atribuir ao sal�rios dos oper�rios o aumento de 10%
		operario1.aumento(aumento);
		operario2.aumento(aumento);
		
		System.out.printf("%nNovo sal�rio dos oper�rios: %n");
		System.out.printf("%nSal�rio do %s = $%.2f", operario1.getNome(), operario1.getSalario());
		System.out.printf("%nSal�rio do %s = $%.2f", operario2.getNome(), operario2.getSalario());
	}

	
	public Scanner getLer() {
		return ler;
	}
}
