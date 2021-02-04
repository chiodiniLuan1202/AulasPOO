package Pizzaria;

public class Cliente {

	private String nome;
	private int telefone;
	
	public Cliente(String nome, int telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getTelefone() {
		return telefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + telefone;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (telefone != other.telefone)
			return false;
		return true;
	}
	
	
}
