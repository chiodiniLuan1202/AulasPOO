package Gnc;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String rua;
	private int numero;
	private int cep;
	
	public Endereco(int cep, String cidade, String rua, int numero,String logradouro) {
		this.cep = cep;
		this.cidade = cidade;
		this.rua = rua;
		this.numero = numero;
		this.logradouro = logradouro;
		
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
	
	
	
}
