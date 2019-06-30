/*
 * Classe respons�vel por listar e inserir na Lista de Frenqu�ncia Card�aca
 * as pessoas que foram cadastradas.
 * 
 * @author Lucas Gabriel de Souza
 */
package exercicio;

import exercicio.FrequenciaCardiaca;
import java.util.ArrayList;

public class FrequenciaCardiacaProfile {
	
	private ArrayList<FrequenciaCardiaca> lista;
	
	//Inst�ncia um novo objeto da Classe Frequ�ncia Card�aca como ArrayList
	public FrequenciaCardiacaProfile() {
		lista = new ArrayList<FrequenciaCardiaca>();
	}
	
	//M�todo para listar as pessoas cadastradas
	public void listarPessoas() {
		
		if (lista != null & lista.size() > 0) {
			
			for (FrequenciaCardiaca fc : lista) {
				
				System.out.println("\nPessoas cadastradas:");
				System.out.println("Nome Completo: " + fc.getNome());
				System.out.println("Data de nascimento: " + fc.displayDate(fc));
				System.out.println("Idade: " + fc.calculaIdade() + " anos.");
				System.out.format("Frequ�ncia card�aca m�xima: %.2f rpm%n", fc.calcFrequenciaMaxima());
				System.out.format("Frequ�ncia card�aca alvo: %.2f rpm%n", fc.calcFrequenciaAlvo());
			}
		} else {
			System.out.printf("A lista est� vazia!");
		}
	}
	
	//M�todo para inserir os dados no ArrayList de Frequ�ncia Card�aca
	public void inserirPessoaLista(FrequenciaCardiaca fc) {
		lista.add(fc);
	}
}
