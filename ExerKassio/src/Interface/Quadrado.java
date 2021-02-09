package Interface;

public class Quadrado extends Retangulo {
	
	public Quadrado(double lado) {
		super(lado, lado);
	}
	
	public double area() {
		double area;
		area =  (lado * lado);
		return area;
	}
	

}
