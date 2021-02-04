package Pizzaria;

public class PedidoPizzaMedia extends PedidoPizza{
	
	private Sabor sabor1;
	private Sabor sabor2;

	public PedidoPizzaMedia(Cliente cliente, FormaEntrega entrega, int quantidade, Sabor sabor1, Sabor sabor2) {
		super(cliente, entrega, quantidade);
		this.sabor1 = sabor1;
		this.sabor2 = sabor2;
	}
	
	public Sabor getSabor1() {
		return sabor1;
	}
	
	public Sabor getSabor2() {
		return sabor2;	
	}
	
	@Override
	public double getPreco() {
		double preco = 40;
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
		result = prime * result + ((sabor1 == null) ? 0 : sabor1.hashCode());
		result = prime * result + ((sabor2 == null) ? 0 : sabor2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PedidoPizzaMedia other = (PedidoPizzaMedia) obj;
		if (sabor1 != other.sabor1)
			return false;
		if (sabor2 != other.sabor2)
			return false;
		return true;
	}

	
}
