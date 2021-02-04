package Av2Exer2;

public class Nacional extends Produto {
	
	private Categoria categoria;

	public Nacional(int codigo, String descricao, double precoDeCusto, Categoria categoria) {
		super(codigo,descricao, precoDeCusto);
		this.categoria = categoria;
		
	}
	
	public double getPrecoFinal() {
		double precoFinal;
		if(categoria == Categoria.ARTESANAL ) {
			precoFinal = getPrecoCusto() + (getPrecoCusto() * 0.5);
		}else {
			precoFinal = getPrecoCusto() + (getPrecoCusto() * 0.3);;
		}
		
		return precoFinal;
		
	}
	
	public Categoria getCategoria() {
		return categoria;
		
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Nacional other = (Nacional) obj;
		if (categoria != other.categoria)
			return false;
		return true;
	}
}
