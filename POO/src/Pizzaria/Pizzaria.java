package Pizzaria;

import java.util.ArrayList;

public class Pizzaria {
	
	private String nomePizzaria;
	private ArrayList<PedidoPizzaPequena> pedidoPequeno = new ArrayList<>();
	private ArrayList<PedidoPizzaMedia> pedidoMedio = new ArrayList<>();
	private ArrayList<PedidoPizzaGrande> pedidoGrande = new ArrayList<>();
	
	public Pizzaria(String nomePizzaria) {
		this.nomePizzaria = nomePizzaria;
	}
	
	public boolean novoPedido(PedidoPizzaPequena pedidoP) {   
		if(pedidoP == null) {
			return false;
		}
		if(pedidoPequeno.contains(pedidoP)) {
			return false;
		}
		 return pedidoPequeno.add(pedidoP);
	}
	
	public boolean novoPedido(PedidoPizzaMedia pedidoM) {
		if(pedidoM == null) {
			return false;
		}
		if(pedidoMedio.contains(pedidoM)) {
			return false;
		}
		 return pedidoMedio.add(pedidoM);
	}
		
	
	public boolean novoPedido(PedidoPizzaGrande pedidoG) {
		if(pedidoG == null) {
			return false;
		}
		if(pedidoGrande.contains(pedidoG)) {
			return false;
		}
		 return pedidoGrande.add(pedidoG);
	}
	
	public String getNomePizzaria() {
		return nomePizzaria;
	}
	
	public double getValorTotalPedidos() {
		double precoFinal = 0;
		for (PedidoPizza a : pedidoPequeno) {
			precoFinal = precoFinal + a.getPreco();	
		}
		
		for(PedidoPizza b : pedidoMedio) {
			precoFinal = precoFinal + b.getPreco();
		}
		
		for(PedidoPizza c: pedidoGrande) {
			precoFinal = precoFinal +c.getPreco();
		}
		return precoFinal;
	}
}
