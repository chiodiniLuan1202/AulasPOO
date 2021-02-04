package Questao1;

public class Carga extends Veiculo{

	public int kilosCarga;
	
	public Carga(String marca, String modelo, int kilosCarga) {
		super(marca, modelo);
		this.kilosCarga = kilosCarga;
	}
	
	final public int getKilosCarga() {
		return kilosCarga;
	}

}
