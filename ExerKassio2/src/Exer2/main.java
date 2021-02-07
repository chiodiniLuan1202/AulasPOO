package Exer2;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
		 
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		AuxilioEmergencial listaBeneficiados= new AuxilioEmergencial();
		int opcoes=0;
		
			do {

			System.out.println("Menu");
			System.out.println("1 - Novo cadastro");
			System.out.println("2 - Dados beneficios");
			System.out.println("3 - Sair");
			opcoes = ler.nextInt();
		
		
			switch (opcoes) {
			case 1:
				ler.nextLine();
				System.out.println("Escreva seu nome completo:");
				String nome= ler.nextLine();
				System.out.println("Escreva sua situção entre: 1-EMPREGADO,2-DESEMPREGADO,3-EMPREGADOR");
				int opcao = ler.nextInt();
				ler.nextLine();
				Categoria categoria = null;
				if(opcao==1) {
					categoria=categoria.EMPREGADO;
				}
				if(opcao==2) { 
					categoria=categoria.DESEMPREGADO;
				}
				if(opcao==3) { 
					categoria=categoria.EMPREGADOR;
				}
				ler.nextLine();
				System.out.println("Digite sua data de nascimento:");
				String dataNasc = ler.nextLine();
				System.out.println("Informe sua Idade");
				int idade = ler.nextInt();
				ler.nextLine();
				System.out.println("Escreva seu Estado: ");
				String estado = ler.nextLine().trim();
				System.out.println("Você é aposentado 1- sim e 2- não ?");
				int apos=ler.nextInt();
				boolean aposentado;
				ler.nextLine();
				if(apos==1) {
					aposentado=true;
				}else {
					aposentado=false;
				}
				
				Beneficiados pessoa1=new Beneficiados(nome,idade,dataNasc,categoria,estado,aposentado,6);
				if(pessoa1.getEstado()=="Santa Catarina") {
					pessoa1.moraSantaCatarina();
				}
				
				listaBeneficiados.addBeneficiados(pessoa1);
				break;
			case 2:
				System.out.println(listaBeneficiados.maiorValor());
				System.out.println(listaBeneficiados.maiorTempo());
				System.out.println(listaBeneficiados.listarBeneficiados());
			
			break;
			
			}
			}while(opcoes!=3);
			
			
	}
	
	

}