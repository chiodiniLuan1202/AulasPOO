package BuscaPadrão;

public class main {

	public static void main(String[] args) {
		
		String txt01 = "C:/Users/Particular/Desktop/teste.txt/";
	    String [][] binarios;
	    
	    LerArquivo conteudo = new LerArquivo();
	    CriaMatriz Matriz = new CriaMatriz();
	    binarios = Matriz.criaMatriz(conteudo.leitura(txt01));

	}
}
