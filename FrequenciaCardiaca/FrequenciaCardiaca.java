/*
 * Classe da Frequência Cardiáca, contendo todos os atributos que serão manipulados
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import java.util.Calendar;

//Class
public class FrequenciaCardiaca {

	//Variáveis de instância
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
	
	
	//Método para mostrar a data de nascimento entre "\"
	public String displayDate(FrequenciaCardiaca displayDate) {
		
		return displayDate.getDataNascimento().substring(0, 2) + "/" +
		displayDate.getDataNascimento().substring(2, 4) + "/" +
		displayDate.getDataNascimento().substring(4, 8);
	}
	
	//Método para calcular a idade;
	public int calculaIdade() {
		//Instância da Classe Calendar do JAVA
		Calendar hoje = Calendar.getInstance();
		
		//Ano atual - a conversão para "Inteiro" da variável "dataNascimento" 
		//O comando "substring(4,8)" pega as posições em que foi armazenado o Ano que o usuário informou
		return hoje.get(Calendar.YEAR) - Integer.parseInt(getDataNascimento().substring(4, 8));
	}
	
	//Método para calcular a frequência cardíaca máxima
	public double calcFrequenciaMaxima() {
		
		return (207 - (0.7 * calculaIdade()));
	}
	
	//Método para calcular a frequência cardíaca de repouso
	public double calcFrequenciaRepouso() {
		
		return (62 + 64 + 67)/3;
	}
	
	//Método para calcular a frequência cardíaca da reserva
	public double calcFrequenciaReserva() {
		
		return (calcFrequenciaMaxima() - calcFrequenciaRepouso());
	}
	
	//Método para calcular a frequência cardíaca alvo
	public double calcFrequenciaAlvo() {
		
		return (calcFrequenciaReserva() * 0.6) + calcFrequenciaRepouso();
	}
}
