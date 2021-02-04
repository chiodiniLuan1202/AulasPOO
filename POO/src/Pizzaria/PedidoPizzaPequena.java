package Pizzaria;

import java.util.Objects;

public class PedidoPizzaPequena extends PedidoPizza{

	private Sabor sabor;
	
	public PedidoPizzaPequena(Cliente cliente, FormaEntrega entrega, int quantidade, Sabor sabor) {
		super(cliente, entrega, quantidade);
		this.sabor = sabor;
	}
	
	public Sabor getSabor() {
		return sabor;
		
	}
	
	@Override
	public double getPreco() {
		double preco = 30;
		if(super.getEntrega() == FormaEntrega.DELIVERY) {
			preco = (preco*getQuantidade()) + 5;
		}else {
			preco = (preco*getQuantidade());
		}
		return preco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((sabor == null) ? 0 : sabor.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		PedidoPizzaPequena other = (PedidoPizzaPequena) obj;
		
		return Objects.equals(getCliente(), other.getCliente()) &&
				(getEntrega().equals(other.getEntrega())) &&
				(this.sabor.equals(other.sabor));
	}

	
}
