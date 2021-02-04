package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Populacao {
	
	public static BufferedReader lendoCSV(String arquivoCSV, String separador, String[] cidade) {
        BufferedReader conteudoArquivo = null;
        String linha = "";

        try{
            conteudoArquivo = new BufferedReader(new FileReader(arquivoCSV));
            linha = conteudoArquivo.readLine();
            while((linha = conteudoArquivo.readLine()) != null) {
                cidade = linha.split(separador);
            }
            System.out.println("A leitura do arquivo deu certo!");
        } catch(FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: \n" + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e ) {
            System.out.println("Indice fora dos limites: \n" + e.getMessage());
        } catch(IOException e) {
            System.out.println("Erro de entrada de dados: \n" + e.getMessage());
        } finally {
            if(conteudoArquivo != null) {
                try {
                    conteudoArquivo.close();
                } catch(IOException e) {
                    System.out.println("Erro de entrada de dados: \n" + e.getMessage());
                }
            }
        }
        return conteudoArquivo;
    }

}
