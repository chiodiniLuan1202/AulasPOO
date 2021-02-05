package Gnc;

public class Filme {
	
	private String tituloOriginal;
	private String tituloPortugues;
	private String genero;
	private int duracao;
	private int faixaEtaria;
	private String paisOrigem;
	private Ator autor;
	private String diretor;
	private String TipoExibicao;
	private Secao secao;
	
	public Filme(String tituloOriginal, int duracao, int faixaEtaria, String tipoExibicao, Secao secao) {
		this.tituloOriginal = tituloOriginal;
		this.duracao = duracao;
		this.faixaEtaria = faixaEtaria;
		this.TipoExibicao = tipoExibicao;
		this.secao = secao;
		
	}

	public String getTituloOriginal() {
		return tituloOriginal;
	}

	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}

	public String getTituloPortugues() {
		return tituloPortugues;
	}

	public void setTituloPortugues(String tituloPortugues) {
		this.tituloPortugues = tituloPortugues;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public int getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(int faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	public Ator getAutor() {
		return autor;
	}

	public void setAutor(Ator autor) {
		this.autor = autor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	public String getTipoExibicao() {
		return TipoExibicao;
	}

	public void setTipoExibicao(String tipoExibicao) {
		TipoExibicao = tipoExibicao;
	}

}
