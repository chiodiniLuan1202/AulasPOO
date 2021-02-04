package Questao1;

import java.util.ArrayList;

public class Fabrica {
	
	private final String marca;
	private ArrayList<Veiculo> veiculo =  new ArrayList<>();
	
    public Fabrica (String marca) {
    	this.marca = marca;
    }
    
    final public String getMarca() { 
    	return marca;
    }
    
    final public ArrayList<Veiculo> getVeiculos(){
		return veiculo;
    }
    
    public void construirVeiculoCarga (String modelo, int kilosCarga) {
    	Carga carg = new Carga(getMarca(), modelo, kilosCarga);
    	veiculo.add(carg);
    }
    
    public void construirVeiculoTransporte (String modelo, int qtPassageiros) {
    	Transporte transp = new Transporte(getMarca(), modelo, qtPassageiros);
    	veiculo.add(transp);
    }

    public void construirVeiculoCorrida (String modelo, double velocidadeMax) {
    	Corrida corri = new Corrida(getMarca(), modelo, velocidadeMax);
    	veiculo.add(corri);
    }
    
    public int qtVeiculoCarga() {
    	int cont = 0;
    	if(veiculo != null) {
    		for(Veiculo carg : veiculo) {
    			cont++;
    		}
    	}
    	
    	return cont;
    }
    
    public int qtVeiculoTransporte() {
    	int cont = 0;
    	if(veiculo != null) {
    		for(Veiculo transp : veiculo) {
    			cont++;
    		}
    	}
    	
    	return cont;
    }
    
    public int qtVeiculoCorrida() {
    	int cont = 0;
    	if(veiculo != null) {
    		for(Veiculo corri : veiculo) {
    			cont++;
    		}
    	}
    	
    	return cont;
    }	
   
}
