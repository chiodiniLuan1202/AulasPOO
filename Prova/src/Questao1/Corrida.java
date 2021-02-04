package Questao1;

public class Corrida extends Veiculo{

	
	public double velocidadeMax;
	
	public Corrida(String marca, String modelo, double velocidadeMax) {
		super(marca, modelo);
		this.velocidadeMax = velocidadeMax;
	}
	
	final public double getVelocidadeMax() {
		return velocidadeMax;
	}

}
