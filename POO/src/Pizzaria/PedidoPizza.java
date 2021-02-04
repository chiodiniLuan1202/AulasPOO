package Pizzaria;

public class PedidoPizza {

	
	private int quantidade;
	private Cliente cliente;
	private FormaEntrega entrega;
	
	public PedidoPizza(Cliente cliente, FormaEntrega entrega, int quantidade) {
		this.quantidade= quantidade;
		
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public FormaEntrega getEntrega() {
		return entrega;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPreco() {
		return 0;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantidade;
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoPizza other = (PedidoPizza) obj;
		if (quantidade != other.quantidade)
			return false;
		return true;
	}
	
	
	
}
