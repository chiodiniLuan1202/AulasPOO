package PilhaLista;

public class PilhaVetor implements Pilha{
	
	private int n = 0;
	private int tam;
	private float[] vet;

	@Override
	public void push(float v) throws Exception {
		
		while(vet[n] != vet[tam]) {
				vet[n]= v;
				n++;
		}	
	}

	@Override
	public float pop() throws Exception {
		
		vet[n] = (Float) null;
		n--;
		return vet[n];
	}

	@Override
	public float top() throws Exception {
		
		return vet[n];
	}

	@Override
	public boolean vazia() {
		if(vet[n] != (Float) null){
			return false;
		}else {
			return true;
		}
		
	}

	@Override
	public void libera() {
		
		vet[n]= (Float) null;
		tam = 0;
		n = 0;
		
		
	}

}
