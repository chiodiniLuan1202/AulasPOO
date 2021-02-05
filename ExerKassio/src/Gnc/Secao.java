package Gnc;

public class Secao {
	
	private int publico;
	private int horario;
	private Cinema cinema;
	
	public Secao(int publico, int horario, Cinema cinema){
		this.publico = publico;
		this.horario = horario;
		this.cinema = cinema;
	}
	
	public int publico() {
		return publico+1;
	}
}
