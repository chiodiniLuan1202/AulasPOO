package ArvoreEncadeada;

public class NoArvoreBinaria {
	
	int info;
	NoArvoreBinaria esq;
	NoArvoreBinaria dir;
	
	public NoArvoreBinaria (int info) {
		this.info = info;
		this.esq = null;
		this.dir = null;
		
	}
	
	public NoArvoreBinaria(int info, NoArvoreBinaria esq, NoArvoreBinaria dir) {
		this.info = info;
		this.esq = esq;
		this.dir = dir;
	}
	
	
	
}
