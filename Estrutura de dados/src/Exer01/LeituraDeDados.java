package Exer01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class LeituraDeDados {
	
	public void leitura(){
		
		try {
			FileInputStream arquivo = new FileInputStream("Arquivo.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);
			
			String linha;
			String coluna = null;
			
			do {
				linha= br.readLine();
				if(linha != null) {
					String[] nummeros = linha.split(" "); 
					String [] quebraLinha = coluna.split("" + "");
					String [] [] matriz = null;
					
					for(int i = 0; i< linha.length(); i++) {
						for(int j = 0; j< coluna.length(); j++) {
							System.out.println("Numeros lidos" +  matriz[i] [i]);
						}
					}
				}
			}while(linha != null);
			
		}catch(Exception a) {
			System.out.println("Erro ao ler Arquivo!");
		}
}
	}
		