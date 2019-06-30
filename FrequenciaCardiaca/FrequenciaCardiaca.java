/*
 * Classe da Frequ�ncia Cardi�ca, contendo todos os atributos que ser�o manipulados
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import java.util.Calendar;

//Class
public class FrequenciaCardiaca {

	//Vari�veis de inst�ncia
	private String nome;
	private String dataNascimento;
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDataNascimento() {
		 return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	//M�todo para mostrar a data de nascimento entre "\"
	public String displayDate(FrequenciaCardiaca displayDate) {
		
		return displayDate.getDataNascimento().substring(0, 2) + "/" +
		displayDate.getDataNascimento().substring(2, 4) + "/" +
		displayDate.getDataNascimento().substring(4, 8);
	}
	
	//M�todo para calcular a idade;
	public int calculaIdade() {
		//Inst�ncia da Classe Calendar do JAVA
		Calendar hoje = Calendar.getInstance();
		
		//Ano atual - a convers�o para "Inteiro" da vari�vel "dataNascimento" 
		//O comando "substring(4,8)" pega as posi��es em que foi armazenado o Ano que o usu�rio informou
		return hoje.get(Calendar.YEAR) - Integer.parseInt(getDataNascimento().substring(4, 8));
	}
	
	//M�todo para calcular a frequ�ncia card�aca m�xima
	public double calcFrequenciaMaxima() {
		
		return (207 - (0.7 * calculaIdade()));
	}
	
	//M�todo para calcular a frequ�ncia card�aca de repouso
	public double calcFrequenciaRepouso() {
		
		return (62 + 64 + 67)/3;
	}
	
	//M�todo para calcular a frequ�ncia card�aca da reserva
	public double calcFrequenciaReserva() {
		
		return (calcFrequenciaMaxima() - calcFrequenciaRepouso());
	}
	
	//M�todo para calcular a frequ�ncia card�aca alvo
	public double calcFrequenciaAlvo() {
		
		return (calcFrequenciaReserva() * 0.6) + calcFrequenciaRepouso();
	}
}
