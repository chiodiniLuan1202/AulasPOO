package Gnc;

public class Cinema {
	
	private String codigoIdentificacao;
	private String nomeFantasia;
	private Endereco endereco;
	private int capacidadeLotacao;
	private int quantSalasTotal;
	private int quantSalasDisponiveis;
	private int quantTelefonesDisponiveis;
	
	public Cinema(String codigoIdenficacao, String nomeFantasia, Endereco endereco) {
		this.codigoIdentificacao = codigoIdenficacao;
		this.nomeFantasia = nomeFantasia;
		this.endereco = endereco;
		
	}

	public String getCodigoIdentificacao() {
		return codigoIdentificacao;
	}

	public void setCodigoIdentificacao(String codigoIdentificacao) {
		this.codigoIdentificacao = codigoIdentificacao;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public int getCapacidadeLotacao() {
		return capacidadeLotacao;
	}

	public void setCapacidadeLotacao(int capacidadeLotacao) {
		this.capacidadeLotacao = capacidadeLotacao;
	}

	public int getQuantSalasTotal() {
		return quantSalasTotal;
	}

	public void setQuantSalasTotal(int quantSalasTotal) {
		this.quantSalasTotal = quantSalasTotal;
	}

	public int getQuantSalasDisponiveis() {
		return quantSalasDisponiveis;
	}

	public void setQuantSalasDisponiveis(int quantSalasDisponiveis) {
		this.quantSalasDisponiveis = quantSalasDisponiveis;
	}

	public int getQuantTelefonesDisponiveis() {
		return quantTelefonesDisponiveis;
	}

	public void setQuantTelefonesDisponiveis(int quantTelefonesDisponiveis) {
		this.quantTelefonesDisponiveis = quantTelefonesDisponiveis;
	}
	
}
