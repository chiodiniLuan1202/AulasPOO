package Interface;

public class Circulo implements FigurasGeometrica{

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}
	
	public double area() {
		double area;
		area =  3.14 *(raio * raio);
		return area;
	}
	

}
