package Questao1;

public class Transporte extends Veiculo{
	
	public int qtPassageiros;
	
	public Transporte(String marca, String modelo, int qtPassageiros) {
		super(marca, modelo);
		this.qtPassageiros = qtPassageiros;
		
	}	
	
	final public int getQtPassageiros() {
		return qtPassageiros;
	}

}
