package Filas;

public class FilaLista implements Fila {
	
	private NoLista ini;
	private NoLista fim;
	private int counter;
	
	public FilaLista(){
		ini = null;
		fim = null;
	}

	@Override
	public void insere(Object v) throws Exception {
		
		NoLista obj =  new NoLista(v, null);
		//a lista esta vazia
		if(counter == 0) {
			ini = obj;
			fim =  obj;
		}else {
			//a lista não esta vazia
			this.fim =  obj.getNext();
		}
		counter++;
	}

	@Override
	public Object retira() throws Exception {
		
		NoLista obj =  new NoLista(ini, null);
		NoLista ini = null;
		
		counter =  0;
		
		while ( ini == obj.getInfo() ) {
			ini= ini.getNext();
			counter--;
		}
		ini.setNext(null);
		ini.setNext(ini.getNext());
		
		return null;
	}

	@Override
	public boolean vazia() {
		if(ini == null) {
			return false;
		}else {
			return true;
			}
	}

	@Override
	public void libera() {
		ini = null;
		fim = null; 
		counter = 0;
	}

}
