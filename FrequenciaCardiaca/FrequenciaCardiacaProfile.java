/*
 * Classe responsável por listar e inserir na Lista de Frenquência Cardíaca
 * as pessoas que foram cadastradas.
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import exercicio.FrequenciaCardiaca;
import java.util.ArrayList;

public class FrequenciaCardiacaProfile {
	
	private ArrayList<FrequenciaCardiaca> lista;
	
	//Instância um novo objeto da Classe Frequência Cardíaca como ArrayList
	public FrequenciaCardiacaProfile() {
		lista = new ArrayList<FrequenciaCardiaca>();
	}
	
	//Método para listar as pessoas cadastradas
	public void listarPessoas() {
		
		if (lista != null & lista.size() > 0) {
			
			for (FrequenciaCardiaca fc : lista) {
				
				System.out.println("\nPessoas cadastradas:");
				System.out.println("Nome Completo: " + fc.getNome());
				System.out.println("Data de nascimento: " + fc.displayDate(fc));
				System.out.println("Idade: " + fc.calculaIdade() + " anos.");
				System.out.format("Frequência cardíaca máxima: %.2f rpm%n", fc.calcFrequenciaMaxima());
				System.out.format("Frequência cardíaca alvo: %.2f rpm%n", fc.calcFrequenciaAlvo());
			}
		} else {
			System.out.printf("A lista está vazia!");
		}
	}
	
	//Método para inserir os dados no ArrayList de Frequência Cardíaca
	public void inserirPessoaLista(FrequenciaCardiaca fc) {
		lista.add(fc);
	}
}
