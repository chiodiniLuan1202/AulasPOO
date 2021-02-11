package AtividadeAvaliativa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		AuxilioEmergencial a = new AuxilioEmergencial();
		int escolha = 0;

		while(escolha != 7) {
			System.out.println("Menu");
			System.out.println("1 - Cadastrar nova pessoa");
			System.out.println("2 - Listar Benefeciados");
			System.out.println("3 - Maior Tempo");
			System.out.println("4 - Maior valor");
			System.out.println("5 - Contar Pessoas");
			System.out.println("6 - Monstrar Usuario");
			System.out.println("7 - Sair");
			
			escolha = teclado.nextInt();
			
			switch (escolha) {
			case 1:
				a.insertBeneficiado();
				break;
			case 2:
				a.listarCadastros();
				break;
			case 3:
				a.listarMaiorTempo();
				break;
			case 4:
				a.listarMaiorValor();
				break;
			case 5:
				a.listarTotalBeneficiarios();
				break;
				
			case 6:
				a.mostrarBeneficiado();;
				break;	
			}
		}
		
		teclado.close();
		
	}

	

}
