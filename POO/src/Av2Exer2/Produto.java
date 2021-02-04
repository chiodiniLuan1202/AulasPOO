package Av2Exer2;

public class Produto { 	
	
	private int codigo;
	private String descricao;
	private double precoDeCusto;
	
	public Produto(int codigo, String descricao, double precoDeCusto) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.precoDeCusto = precoDeCusto;
	}
	
	public double getPrecoCusto() {
		return precoDeCusto;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
