package Questao2;

import java.util.ArrayList;

public class Sequencia implements Imprimivel{

	private int inicio;
	private int fim;
	
	public Sequencia(int inicio,int fim) {
		this.inicio = inicio;
		this.fim = fim;
	}
	
	@Override
	public String formatoImpressao() {
		int vetor[] = null;
		int cont = 0;
		
		for (int i = inicio; i <= fim; i++) {
			vetor[i] = i;
			cont++;
		}
		int j= 0;
		while(vetor[j] <= vetor[cont]) {
					j++;
					vetor.toString();
		}
		return vetor.toString();
	}
}
