/*
 * Classe principal, respons�vel por chamar o menu
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import exercicio.FrequenciaCardiacaTela;

public class FrequenciaCardiacaApp {
	
	private static FrequenciaCardiacaTela chama;
	
	public static void main(String[] args) {
		
		chama = new FrequenciaCardiacaTela();
		
		chama.Menu();
		
		//Inst�ncia para manipular os m�todos da Classe FrequenciaCardiaca.
		//FrequenciaCardiaca info =  new FrequenciaCardiaca();
		//ler = new Scanner(System.in);
		
		//System.out.println("Digite seu nome completo abaixo");
		//String nomeCompleto = ler.nextLine();
		
		//Inserindo na vari�vel "nome", o nome que o usu�rio informou.
		//info.setNome(nomeCompleto);
		
		//System.out.println("\nDigite sua data de nascimento abaixo");
		//String dataNascimento = ler.nextLine();
		//info.setDataNascimento(dataNascimento);
		
		//Retorna ao usu�rio a Data de Nascimento separada por "/", sua Idade e demais dados.
		//info.displayDate(info);
		//System.out.print("\nIdade: " + info.calculaIdade() + " anos.");
		//System.out.format("%nSua frenquencia cardiaca m�xima � %.2f rpm", info.calcFrequenciaMaxima());
		//System.out.format("%nSua frenquencia cardiaca alvo � %.2f rpm", info.calcFrequenciaAlvo());
		
	}
}
