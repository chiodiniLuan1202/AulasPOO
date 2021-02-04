package EntregaFinal;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArvoreBinaria {
	
	static No raiz;
	int size; 
	
	public ArvoreBinaria (int valor) {
		raiz = null;
		size = 0;
	}

	public No insere(int valor) {
		
		No no = new No(valor);
		
		return no;
	}
	
	public static void inserir (int valor) {
		inserir(raiz, valor);
	}
	
	public static void inserir (No node, int valor) {
		if(node == null) {
			raiz = new No(valor);
		}else {
			
			if (valor < node.valor) {
				
				if(node.esq != null) {
					inserir(node.esq, valor);
				}else {
					System.out.println("Inserindo" + valor + "a esquerda de " + node.valor);
					node.esq = new No(valor);
				}
				
			}else{
				if(node.dir != null){
					inserir(node.dir, valor);
				}else {
					System.out.println("Inserindo" + valor + "a direita de " + node.valor);
					node.dir = new No(valor);
				}
			}
		}
	}
	
	public static void removerNo( No arvore , int valor) {
		if(arvore.valor == valor) {
			arvore = null;
		}else if(arvore.valor > valor ) {
			if((arvore.esq.valor == valor)) {
				estrategiaParaRemoverNoEsq(arvore);
			}else {
				removerNo(arvore.esq, valor);
			}
		}else { 
			if((arvore.dir.valor == valor)) {
				estrategiaParaRemoverNoDir(arvore);
			}else {
				removerNo(arvore.dir, valor);
			}
		}
	}
	
	public static void estrategiaParaRemoverNoDir(No noPai) {
		int filhos = 0;
		No noRemover = null;
		noRemover = noPai.dir;
		filhos = totalFilhos(noRemover);
		
		if(filhos == 0) {
			removerSemFilhos(noPai, "D");
		}else if(filhos == 1) {
			removerUmFilhoDireita(noPai, "E");
		}else if(filhos == 2) {
			removerUmFilhoDireita(noPai, "D");
		}
	}
	
	public static void estrategiaParaRemoverNoEsq(No noPai) {
		int filhos = 0;
		No noRemover = null;
		noRemover = noPai.esq;
		filhos = totalFilhos(noRemover);
		
		if(filhos == 0) {
			removerSemFilhos(noPai, "D");
		}else if(filhos == 1) {
			removerUmFilhoEsquerda(noPai, "E");
		}else if(filhos == 2) {
			removerUmFilhoEsquerda(noPai, "D");
		}
	}
	
	public static void removerSemFilhos(No noPai, String subArvore) {
		if(subArvore.equals ("E")) {
			noPai.esq = null;
		}else {
			noPai.dir = null;
		}
	}
	
	public static void removerUmFilhoEsquerda(No noPai,String subArvore) {
		if(subArvore.equals("D")){
			noPai.esq = noPai.esq.esq;
		}else {
			noPai.esq =  noPai.esq.dir;
		}
	}
	
	public static void removerUmFilhoDireita(No noPai,String subArvore) {
		if(subArvore.equals("E")){
			noPai.dir = noPai.dir.esq;
		}else {
			noPai.dir =  noPai.dir.dir;
		}
	}
	public static int totalFilhos(No no) {
		int total = 0;
		
		if(no.esq != null) {
			total += 1;
		}
		
		if(no.dir != null) {
			total += 2;
		}
		
		return total;
	}
	public boolean vazia() {
		if(raiz == null) { 
			return true;
		}else {
			return false;
		}
	}
	
	public void porNivel(No no){
		if (no == null);
	    Deque<No> fila = new ArrayDeque<>();
	    fila.add(no);
	    while (!fila.isEmpty()) {
	        No atual = fila.removeFirst();
	        System.out.printf("%s, ", atual.getConteudo());
	        if (atual.getFilhoEsquerda() != null) fila.add(atual.getFilhoEsquerda());
	        if (atual.getFilhoDireita() != null) fila.add(atual.getFilhoDireita());
	    }   
	}
	
	public void preOrdem (No node){
		System.out.println(" " + node.valor);
		
		if (node.esq != null) {
			preOrdem(node.esq);
		}
		
		if(node.dir != null) {
			preOrdem(node.dir);
		}
	}
	
	public void inOrdem (No node){
		
		if (node.esq != null) {
			inOrdem(node.esq);
			}
		
		System.out.println(" " + node.valor);
		
		if(node.dir != null) {
			inOrdem(node.dir);
		}
	}
	
	public void posOrdem (No node){
		
		if (node.esq != null) {
			posOrdem(node.esq);
			}
		
		if(node.dir != null) {
			posOrdem(node.dir);
		}
		
		System.out.println(" " + node.valor);
		
	}
}
