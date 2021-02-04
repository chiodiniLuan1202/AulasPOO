package ArvoreEncadeada;

public class ArvoreBinaria {
	
	static NoArvoreBinaria raiz;
	int size; 
	
	public ArvoreBinaria () {
		raiz = null;
		size = 0;
	}
	
	public NoArvoreBinaria insere(int v) {
		
		NoArvoreBinaria no = new NoArvoreBinaria(v);
		
		return no;
	}
	
	public static void inserir (int info) {
		inserir(raiz, info);
	}
	
	public static void inserir (NoArvoreBinaria node, int info) {
		if(node == null) {
			raiz = new NoArvoreBinaria(info);
		}else {
			
			if (info < node.info) {
				
				if(node.esq != null) {
					inserir(node.esq, info);
				}else {
					System.out.println("Inserindo" + info + "a esquerda de " + node.info);
					node.esq = new NoArvoreBinaria(info);
				}
				
			}else{
				if(node.dir != null){
					inserir(node.dir, info);
				}else {
					System.out.println("Inserindo" + info + "a direita de " + node.info);
					node.dir = new NoArvoreBinaria(info);
				}
			}
			
		}
	}
	
	public boolean vazia() {
		if(raiz == null) { 
			return true;
		}else {
			return false;
		}
	}
	
	public void preOrdem (NoArvoreBinaria node){
		System.out.println(" " + node.info);
		
		if (node.esq != null) {
			preOrdem(node.esq);
		}
		
		if(node.dir != null) {
			preOrdem(node.dir);
		}
	}
	
	public void inOrdem (NoArvoreBinaria node){
		
		if (node.esq != null) {
			inOrdem(node.esq);
			}
		
		System.out.println(" " + node.info);
		
		if(node.dir != null) {
			preOrdem(node.dir);
		}
	}
	
	public void posOrdem (NoArvoreBinaria node){
		
		if (node.esq != null) {
			posOrdem(node.esq);
			}
		
		if(node.dir != null) {
			preOrdem(node.dir);
		}
		
		System.out.println(" " + node.info);
		
	}
}
