package Av2Exer2;

public class Importado extends Produto{
	
	private double taxaImportacao;
	
	public Importado(int codigo, String descricao, double precoDeCusto, double taxaImportacao) {
		super(codigo,descricao,precoDeCusto);
		this.taxaImportacao = taxaImportacao;
	}
	
	public double getPrecoMinimo() {
		double precoMinimo;
		precoMinimo = getPrecoCusto() + (getPrecoCusto() * taxaImportacao);
		
		return precoMinimo;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(taxaImportacao);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Importado other = (Importado) obj;
		if (Double.doubleToLongBits(taxaImportacao) != Double.doubleToLongBits(other.taxaImportacao))
			return false;
		return true;
	}
	
	

}
