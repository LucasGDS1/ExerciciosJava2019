/*
 * Classe principal, responsável por chamar o menu
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
		
		//Instância para manipular os métodos da Classe FrequenciaCardiaca.
		//FrequenciaCardiaca info =  new FrequenciaCardiaca();
		//ler = new Scanner(System.in);
		
		//System.out.println("Digite seu nome completo abaixo");
		//String nomeCompleto = ler.nextLine();
		
		//Inserindo na variável "nome", o nome que o usuário informou.
		//info.setNome(nomeCompleto);
		
		//System.out.println("\nDigite sua data de nascimento abaixo");
		//String dataNascimento = ler.nextLine();
		//info.setDataNascimento(dataNascimento);
		
		//Retorna ao usuário a Data de Nascimento separada por "/", sua Idade e demais dados.
		//info.displayDate(info);
		//System.out.print("\nIdade: " + info.calculaIdade() + " anos.");
		//System.out.format("%nSua frenquencia cardiaca máxima é %.2f rpm", info.calcFrequenciaMaxima());
		//System.out.format("%nSua frenquencia cardiaca alvo é %.2f rpm", info.calcFrequenciaAlvo());
		
	}
}
