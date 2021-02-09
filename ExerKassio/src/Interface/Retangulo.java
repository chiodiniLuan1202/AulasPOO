package Interface;

public class Retangulo implements FigurasGeometrica{
	
	protected double lado;
	private double altura;

	public Retangulo(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}
	
	public double area() {
		double area;
		area =  (lado * altura);
		return area;
	}

}
