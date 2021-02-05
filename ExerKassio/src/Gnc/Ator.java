package Gnc;

public class Ator {
	
	private String numeroIdentificacao;
	private String nome;
	private String nacionalidade;
	private int idade;
	private Filme filme;
	
	public Ator(String numeroIdentifacacao, String nome, String nacionalidade, int idade, Filme filme) {
		this.numeroIdentificacao = numeroIdentifacacao;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.filme = filme;
	}

	public String getNumeroIdentificacao() {
		return numeroIdentificacao;
	}

	public void setNumeroIdentificacao(String numeroIdentificacao) {
		this.numeroIdentificacao = numeroIdentificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
