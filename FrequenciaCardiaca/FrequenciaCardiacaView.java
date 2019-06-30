/*
 * Classe respons�vel por receber os dados do usu�rio
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
		
		//Inserindo na vari�vel "nome", o nome que o usu�rio informou.
		info.setNome(nomeCompleto);
		
		System.out.println("\nDigite sua data de nascimento abaixo");
		String dataNascimento = scan.nextLine();
		info.setDataNascimento(dataNascimento);
		
		//Chamada para o m�todo de inserir Pessoa, passando como par�metro a vari�vel
		//"info" que referencia o objeto Frequ�ncia Card�aca
		control.inserirPessoaLista(info);	
	}
}
