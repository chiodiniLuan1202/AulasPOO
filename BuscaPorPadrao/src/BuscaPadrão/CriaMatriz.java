package BuscaPadrão;

import java.util.List;

public class CriaMatriz {
	
	public String[][] criaMatriz(List conteudo) {
		int linha = conteudo.size();
		int coluna = 0;
		
		  if (( (String) conteudo.get(0)).contains(" ")) {
		        String s = (String) conteudo.get(0);
		        for (int j = 0; j < s.length(); j++) {
		            Character c = s.charAt(j);
		            if (c.equals('|')) {
		                coluna++;
		            }
		        }
		    }coluna--;

		    String[][] matriz = new String[linha][coluna];

		    for (int i = 0; i < linha; i++) {
		        for (int j = 0; j < coluna; j++) {
		            matriz[i][j] = "";
		            String s = (String) conteudo.get(i);
		            for (int x = 0; x < s.length(); x++) {
		                Character caracter = s.charAt(x);
		                if (!caracter.equals('|')) {
		                    matriz[i][j] += caracter.toString();
		                } else if (x != 0 && j < coluna - 1) {
		                    j++;
		                    matriz[i][j] = "";
		                }
		            }
		        }
		    }
		    return matriz;
		}
}
