package Dado;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int qtde = 1;
		while(qtde != 0 || qtde != 150001 )
		System.out.println("Quantas Jogasdas você deseja? (Entre 1 e 150000) ");
		qtde = teclado.nextInt();
		
		Random rd = new Random();
		int num;
		
		int numeroUm = 0;
		int numeroDois = 0;
		int numeroTres = 0;
		int numeroQuatro = 0;
		int numeroCinco = 0;
		int numeroSeis = 0;
		
		for (int i = 0; i < qtde; i++) {
				num = 1 + rd.nextInt(6); 
			if(num == 1) {	
				numeroUm++;
			}
			
			if(num == 2) {	
				numeroDois++;
			}
			
			if(num == 3) {	
				numeroTres++;
			}
			
			if(num == 4) {	
				numeroQuatro++;
			}
			
			if(num == 5) {
				numeroCinco++;
			}
			
			if(num == 6) {
				numeroSeis++;
			}
				
		}
		
		System.out.println("O numero 1 foi monstrado: " + numeroUm);
		System.out.println("O numero 2 foi monstrado: " + numeroDois);
		System.out.println("O numero 3 foi monstrado: " + numeroTres);
		System.out.println("O numero 4 foi monstrado: " + numeroQuatro);
		System.out.println("O numero 5 foi monstrado: " + numeroCinco);
		System.out.println("O numero 6 foi monstrado: " + numeroSeis);
	}

}
