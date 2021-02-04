package Filas;

public class FilaVetorCircular implements Fila {
	
	private int n;
	private int ini;
	private int tam;
	private int fim;
	private Object[] vet[] ;
	
	public FilaVetorCircular(int tam) {
		this.tam = tam;
		fim = (ini - n)% tam;
	}
	
	@Override
	public void insere(Object v) throws Exception {
		while(vet[n] != vet[tam]) {
			
			if(vet[n] == vet[ini]) {
				vet[n] = (Object[]) v;
				fim = n;
				ini = n;
			}else {
				vet[n]= vet;
				fim = n;		
			}
				n++;
		}
	}
	@Override
	public Object retira() throws Exception {
		
		vet[ini] =  null;
		ini= ini++;
	
		return null;
	}
	@Override
	public boolean vazia() {
		if(vet[ini] == null) {
			
			return true;
		}else {
			return false;
		}
	}
	@Override
	public void libera() {
		
		vet[n] = null;
		ini = 0;
		tam = 0;
		n = 0;
		
	}
}

