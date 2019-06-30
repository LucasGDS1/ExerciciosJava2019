/*
 * Classe responsável por receber os dados do usuário
 * 
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import exercicio.FrequenciaCardiaca;
import java.util.Scanner;

public class FrequenciaCardiacaView {
	
	private FrequenciaCardiacaProfile control;
	private Scanner scan;
	
	public FrequenciaCardiacaView() {
		control = new FrequenciaCardiacaProfile();
	}
	
	public void listarTodos() {
		control.listarPessoas();
	}
	
	public void inserirPessoa() {
		FrequenciaCardiaca info =  new FrequenciaCardiaca();
		scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo abaixo");
		String nomeCompleto = scan.nextLine();
		
		//Inserindo na variável "nome", o nome que o usuário informou.
		info.setNome(nomeCompleto);
		
		System.out.println("\nDigite sua data de nascimento abaixo");
		String dataNascimento = scan.nextLine();
		info.setDataNascimento(dataNascimento);
		
		//Chamada para o método de inserir Pessoa, passando como parâmetro a variável
		//"info" que referencia o objeto Frequência Cardíaca
		control.inserirPessoaLista(info);	
	}
}
