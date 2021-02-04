package Questao1;

public class Veiculo {
	
	private String marca;
	private String modelo;
	
	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
	
	final public String getMarca() { 
		return marca;
	}
	
	final public String getModelo() {
		return modelo;
	}

}
