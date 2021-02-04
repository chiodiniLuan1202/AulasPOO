package Empregado;

public final class Mensalidade extends Empregado{

	
	private double salarioMensal;
	
	public Mensalidade(String nome,double salarioMensal) {
		super(nome);
		this.salarioMensal = salarioMensal;
		
	}
	
	@Override
	public double getSalarioBruto() {	
		return salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}

	
}
