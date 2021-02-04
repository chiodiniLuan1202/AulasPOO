package a18;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public Pessoa(String nome, int idade) {
		this(nome);
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void oi() {
		System.out.println("Olá, eu me chamo " + nome + " e tenho " + idade + " anos.");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idade;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
		Pessoa other = (Pessoa) obj;
		if (idade != other.idade)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
