package BuscaPadrão;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

	public class LerArquivo{
	
		public List leitura(String File) {
	
			List<String> conteudo = new ArrayList<String>();
	    try {
	        BufferedReader in = new BufferedReader(new FileReader(File));
	        String str;
	
	        while ((str = in.readLine()) != null) {
	            conteudo.add(str);
	        }
	        in.close();
	    	} catch (IOException ioe){
	        System.out.println(ioe);
			}
	    return conteudo;
	}
}
