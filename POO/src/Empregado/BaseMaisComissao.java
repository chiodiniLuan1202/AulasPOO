package Empregado;

public final class BaseMaisComissao extends Comissario{

	private double salarioBase;
	
	public BaseMaisComissao(String nome, double vendasBrutas, double percentualComissao,double salarioBase) {
		super(nome, vendasBrutas, percentualComissao);
		this.salarioBase = salarioBase;
	}
	
	public final double getSalarioBruto() {
		return salarioBase + super.getSalarioBruto();
	}
}
