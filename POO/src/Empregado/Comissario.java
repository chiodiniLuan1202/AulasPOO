package Empregado;

public class Comissario extends Empregado{

	private double vendasBrutas;
	private double percentualComissao; 
	
	public Comissario(String nome, double vendasBrutas, double percentualComissao) {
		super(nome);
		this.percentualComissao = percentualComissao;
		this.vendasBrutas = vendasBrutas;
	}

	
	public double getSalarioBruto() {
		return vendasBrutas * percentualComissao;
	} 
	

}
