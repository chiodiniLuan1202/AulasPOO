package AtividadeAvaliativa;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {

	
		
		 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		AuxilioEmergencial a= new AuxilioEmergencial();
		int escolha=0;
		int desempregado=0;
			
			do {

			System.out.println("Menu");
			System.out.println("1 - Cadastrar nova pessoa");
			System.out.println("2 - Listar Benefeciados");
			System.out.println("3 - Maior Tempo");
			System.out.println("4 - Maior valor");
			System.out.println("5 - Contar Pessoas");
			System.out.println("6 - Sair");
			escolha = teclado.nextInt();
		
		
			switch (escolha) {
			case 1:
				teclado.nextLine();
				System.out.println("Digite seu nome completo:");
				String nome= teclado.nextLine();
				System.out.println("Digite sua situção entre: 1-EMPREGADO,2-DESEMPREGADO,3-EMPREGADOR");
				int opcao = teclado.nextInt();
				teclado.nextLine();
				Categoria categoria = null;
				if(opcao==1) {
					categoria=categoria.EMPREGADO;
				}
				if(opcao==2) { 
					categoria=categoria.DESEMPREGADO;
					System.out.println("A quanto tempo esta desempregado ?");
					desempregado= teclado.nextInt();
				}
				if(opcao==3) { 
					categoria=categoria.EMPREGADOR;
				}
				teclado.nextLine();
				System.out.println("Digite sua data de nascimento:");
				String dataNasc = teclado.nextLine();
				System.out.println("Informe sua Idade");
				int idade = teclado.nextInt();
				teclado.nextLine();
				System.out.println("Informe seu Estado: ");
				String estado = teclado.nextLine().trim();
				System.out.println("É aposentado 1- sim e 2- não ?");
				int apos=teclado.nextInt();
				boolean aposentado;
				teclado.nextLine();
				if(apos==1) {
					aposentado=true;
				}else {
					aposentado=false;
				}
				
				Beneficiados p1=new Beneficiados(nome,idade,dataNasc,categoria,estado,aposentado,desempregado);
				if(p1.getEstado()=="SAO PAULO") {
					p1.moraSaoPaulo();
				}
				
				if(p1.getEstado()=="PARA") {
					p1.moraSaoPaulo();
				}
				a.addBeneficiados(p1);
				break;
			case 2:
				System.out.println(a.listarBeneficiados());
			
				break;
			case 3:
				a.maiorTempo();
			
				break;
			case 4:
				a.maiorValor();
			
				break;
				case 5:
					System.out.println("Quantidade de pessoa cadastradas");
					System.out.println(a.contarElementos());
				
					break;
			}
			}while(escolha!=6);
	
	}
	
	

}
