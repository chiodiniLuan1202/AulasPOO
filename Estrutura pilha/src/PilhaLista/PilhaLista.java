package PilhaLista;

public class PilhaLista implements Pilha {

	private NoLista topo;
	private int cont;
	private int tam;
	private float vet[];
	
	public PilhaLista() {
		 cont = 0;
		tam = 0;
		vet[cont] = (Float) null;
		topo = null;
	}
	
	@Override
	public void push(float info) throws Exception {
		try {	
			while(vet[cont] != vet[tam]) {
				vet[cont]= info;
				topo = (NoLista) topo.getNext();
				cont++;
			}
		}catch(Exception a){
			System.out.println("O seguinte erro foi encontrado: " + a.getMessage());
			System.out.println("Lista está cheia ");
		}
	}

	@Override
	public float pop() throws Exception {
			
		NoLista tmp = topo;
		topo=topo.getNext();
		cont--;
		return vet[cont] ;
	}

	@Override
	public float top() throws Exception {
		return vet[cont];
	}

	@Override
	public boolean vazia() {
		 
		if(vet[cont]== 0) {
			return false;
		}else {
			return true;
			}
	}

	@Override
	public void libera() {
		cont = 0;
		topo = null;
		
	}

}
