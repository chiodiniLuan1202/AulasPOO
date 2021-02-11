package AtividadeAvaliativa;

public class Beneficiado {

	private String nomeCompleto;
	private String dataNasc;
	private int idade;
	private Categoria categoria;
	private String estado;
	private double valorTotal;
	private double valorBeneficio;
	private double tempoDesempregado;
	private boolean aposentado;
	private int desempregado;
	private int tempoBeneficio;
	private boolean saoPaulo;

	public Beneficiado() {
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getTempoBeneficio() {
		return this.tempoBeneficio = 2;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public double getValorBeneficio() {
		return valorBeneficio * this.tempoBeneficio;
	}

	public String getEstado() {
		return estado.toUpperCase().trim();
	}

	public double moraSaoPaulo() {
		return (this.valorBeneficio * (10 / 100)) + this.valorBeneficio;
	}

	public double moraPara() {
		return (this.valorBeneficio * (9 / 100)) + this.valorBeneficio;
	}

	public double reducao6meses() {
		return this.valorBeneficio - (this.valorBeneficio * (10 / 100));
	}

	public double aposentado() {
		return this.valorBeneficio * 6;
	}

	@Override
	public String toString() {

		return "nome: " + this.nomeCompleto + "\n" + "Data Nascimento: " + this.dataNasc + "\n" + "Categoria: "
				+ this.categoria + "\n" + "Idade: " + this.idade + "\n" + "Estado: " + this.estado + "\n"
				+ "Valor Beneficio R$: " + this.valorBeneficio + "\n" + "Tempo Beneficio: " + getTempoBeneficio() + "\n"
				+ "Regras:" + "\n" + "O benefício de pessoas que moram em São Paulo terá acréscimo de 10%;" + "\n"
				+ "O benefício só será concedido para maiores de 18 anos;" + "\n"
				+ "O benefício de pessoas que moram no Pará terá acréscimo de 9%;" + "\n"
				+ "O Se estiver desempregado há menos de 6 meses terá uma redução de 10%;" + "\n"
				+ "O benefício será de 6 meses para aposentados ?";

	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public double getTempoDesempregado() {
		return tempoDesempregado;
	}

	public void setTempoDesempregado(double tempoDesempregado) {
		this.tempoDesempregado = tempoDesempregado;
	}

	public boolean isAposentado() {
		return aposentado;
	}

	public void setAposentado(boolean aposentado) {
		this.aposentado = aposentado;
	}

	public int getDesempregado() {
		return desempregado;
	}

	public void setDesempregado(int desempregado) {
		this.desempregado = desempregado;
	}

	public boolean isSaoPaulo() {
		return saoPaulo;
	}

	public void setSaoPaulo(boolean saoPaulo) {
		this.saoPaulo = saoPaulo;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setValorBeneficio(double valorBeneficio) {
		this.valorBeneficio = valorBeneficio;
	}

	public void setTempoBeneficio(int tempoBeneficio) {
		this.tempoBeneficio = tempoBeneficio;
	}
}

