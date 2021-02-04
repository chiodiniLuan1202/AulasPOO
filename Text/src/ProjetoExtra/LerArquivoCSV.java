package ProjetoExtra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import test1.cidade.Cidade;

public class LerArquivoCSV {
	

	public static void main(String[] args) {

		String csvArquivo = "C:\\Users\\Particular\\Downloads\\populacao.csv";

		BufferedReader conteudoCSV = null;

		String linha = "";

		String csvSeparadorCampo = ";";
		
		

		try {
			conteudoCSV = new BufferedReader(new FileReader(csvArquivo));
			
			System.out.println("Cidades por UF");
			
			while ((linha = conteudoCSV.readLine())!= null) 
			{
				
			String[] cidade = linha.split(csvSeparadorCampo);
			System.out.print(cidade[0]+ " = "+ cidade[1] + ",  ");	
			}
			
			System.out.println("População por UF");
			while((linha = conteudoCSV.readLine())!= null) {
				String[] cidade = linha.split(csvSeparadorCampo);
				System.out.print(cidade[0] + "=" + cidade[2] + ", ");
			}
			System.out.println("População de Homens");
			while((linha = conteudoCSV.readLine())!= null) {
				String[] cidade = linha.split(csvSeparadorCampo);
				System.out.print(cidade[0] + cidade[3] + ": ");
				
			}
			System.out.println("População de Mulheres");
			while((linha = conteudoCSV.readLine())!= null) {
				String[] cidade = linha.split(csvSeparadorCampo);
				System.out.print( cidade[0] + cidade[4] + ": ");
				
			}
			
			
			

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado: " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBounds : \n" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO Erro: \n " + e.getMessage());
		} finally {
			if (conteudoCSV != null) {
				try {
					conteudoCSV.close();
				} catch (IOException e) {
					System.out.println("IO Erro: \n" + e.getMessage());
				}
			}
		}
	
	}	
}
