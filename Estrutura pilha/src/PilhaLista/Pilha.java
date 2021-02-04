package PilhaLista;

public interface Pilha {
	
	void push(float v) throws Exception;
	
	float pop () throws Exception;
	
	float top () throws Exception;
	
	boolean vazia();
	
	void libera();
	
	
}