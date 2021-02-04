package Filas;

public interface Fila {
		
	void insere(Object v) throws Exception;
	
	Object retira() throws Exception;
	
	boolean vazia();
	
	void libera();		
		
}


