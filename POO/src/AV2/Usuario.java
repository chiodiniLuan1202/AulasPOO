package AV2;

import java.util.ArrayList;

public class Usuario {
	private String usuario;
	private ArrayList<String> senhasUtilizadas = new ArrayList<>(5);
		
	public Usuario(String usuario, ArrayList<String> senhaInicial) {
		if (usuario == null || senhaInicial == null) {
            throw new IllegalArgumentException();
       }else{
    	   this.usuario= usuario;
    	   this.senhasUtilizadas = senhaInicial;
       }
	
	}
	public boolean loginOK(String senha) {
		
		if(senhasUtilizadas.contains(senha)) {
			return true;
		}else{
			return false;
		}
	}
	public boolean trocarSenha(String senhaAtual, String senhaNova) {
		if (senhasUtilizadas.contains(senhaAtual)) {
			
			if(senhasUtilizadas.contains(senhaNova)) {
				return false;
			
			}else {
				senhasUtilizadas.add(0, senhaNova);
				senhaAtual = senhaNova;
			}
				return true;
		}else {
				return false;
		}
	}
	public String getUsuario() {
		return usuario;
	}
}