package Prova;

public class Vetor {

	private int[] vetor;
	private String[] vetor2;

	
	public Vetor (int[] vetor) {
		this.vetor= vetor; 
	}
	
	public Vetor(String[] vetor2) {
		this.vetor2 = vetor2;
	}
	
	public static void VetorInverso(int vetor[]) {
		
		int[] vetorInverso = null;
		int j = vetor.length - 1;
		
		for(int i = 0; i < vetor.length ; i++) { 
			   vetorInverso[j] = vetor[i];
			 }		
	}
	
	public static void vetorContatenado(String vetor2[]) {
		
		for(int x = 0; x < vetor2.length ; x++) { 
			   System.out.println(vetor2[x]);
			 }	
	}
}
