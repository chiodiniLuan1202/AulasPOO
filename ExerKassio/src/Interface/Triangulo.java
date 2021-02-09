package Interface;

public class Triangulo implements FigurasGeometrica{

	private double altura;
	private double base;
	
	public Triangulo(double altura, double base) {
		this.altura = altura;
		this.base = base;
	
	}
	
	public double area() {
		double area;
		area =  (base * altura)/2;
		return area;
	}
	
	

}
