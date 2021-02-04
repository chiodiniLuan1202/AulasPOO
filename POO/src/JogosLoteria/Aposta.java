package JogosLoteria;

import java.util.Random;

public class Aposta {
	
	private String nome;
	private int[] numeros;
	
	
	public Aposta(String nome, int qtdNumeros ) {
		
		this.nome = nome ;
		this.numeros = new int[qtdNumeros];
		Random rd = new Random();
		int num;
		
		for(int i = 0; i < qtdNumeros;i++) {
			do {
				num = 1 + rd.nextInt(60);
			}while(jaTem(num));
				this.numeros[i]= num;	
			}
		}
	
		private boolean jaTem(int n) {
			for(int x : this.numeros) {
				if(x == n) {
					return true;
				}
			}
			return false;
		
	}
	
	public Aposta(String nome, int[] numeros ) {
		this.nome= nome ;
		this.numeros = numeros;
	}
	
	public int[] getNumeros() {
		return numeros;
	}
	
	public String getNome() {
		return nome;
	}
	


}
