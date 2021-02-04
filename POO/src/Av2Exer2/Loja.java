package Av2Exer2;

import java.util.ArrayList;

public class Loja {
	
	private String nomeLoja;
	private ArrayList <Importado> importados; 
	private ArrayList <Nacional> nacionais; 
	
	public Loja(String nomeLoja) {
		this.nomeLoja = nomeLoja;
	}
	
	public boolean novoProduto(Nacional novoProdutoNacional) {
		if(nacionais.contains(novoProdutoNacional)) {
			return false;
		}else {
			nacionais.add(novoProdutoNacional);
		return true; 
		}
	}
	
	public boolean novoProduto(Importado novoProdutoImportado) { 
		if(importados.contains(novoProdutoImportado)) {
			return false;
		}else {
			importados.add(novoProdutoImportado);
		return true; 
		}
	}
	//Faltou implementar
	public Nacional nacionalMaisCaro() {
		
		return null; 
	}
	//Faltou implementar
	public Importado importadoMaisCaro() {
		return null;
	}
	
	public String getNomeLoja () {
		return nomeLoja;
	}

}
