/*
 * Classe respons�vel por mostrar ao usu�rio o menu do sistema
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import exercicio.FrequenciaCardiacaView;
import java.util.Scanner;

public class FrequenciaCardiacaTela {
	
	private FrequenciaCardiacaView view; 
	private Scanner scan;
	
	public FrequenciaCardiacaTela() {
		view = new FrequenciaCardiacaView();
	}
	
	public void Menu() {
		scan = new Scanner(System.in);
		int opcao = 0;
		
		while(opcao != 3) {
			
			System.out.println("\n----- Welcome to Menu -----");
			System.out.println(" ");
			System.out.println("Escolhe uma das op��es para ter acesso as funcionaldades dispon�veis\n");
			System.out.println("-- 1 - Inserir Pessoas --");
			System.out.println("-- 2 - Mostrar lista de pessoas --");
			System.out.println("-- 3 - Sair --");
			opcao = scan.nextInt();
			
			switch(opcao) {
				
			case 1:
				view.inserirPessoa();
				break;
			case 2:
				view.listarTodos();
				break;
			case 3:
				System.out.println("Saindo do sistema...");
			}
		}
	}
}
