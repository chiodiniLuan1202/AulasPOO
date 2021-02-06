package Exer2;

import java.util.ArrayList;
import java.util.Scanner;


public class AuxilioEmergencial {

	private String nomeCompleto;
	private String dataNasc;
	private Categoria categoria;
	private String estado;
	private ArrayList<AuxilioEmergencial> empregados = new  ArrayList<>();
	private Scanner ler = new Scanner(System.in);
	
	public AuxilioEmergencial(String nomeCompleto, String dataNasc, Categoria categoria, String estado) {
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
		this.categoria = categoria;
		this.estado = estado;
	}
	
	public boolean empregadoAposentado() {	
		boolean aposentado = false;
		
		if (categoria == categoria.EMPREGADO) {
			int caso;
			System.out.println("Você é aposentado?");
			System.out.println("1 - Sim");
			System.out.println("2 - Não");
			caso = ler.nextInt();
	
			switch(caso) {
			 
			case 1:
				 aposentado = true;
				break;
				 
			 case 2: 
				 aposentado  = false;
				 break;
			 
			 default:
	             System.out.println("Digite SOMENTE números entre 1 e 2");
	             break;	 
			 }
		}
		return aposentado;
	}
	
	public int empregador() {
		int funcionarios = 0;
		
		if (categoria == categoria.EMPREGADOR) {
			System.out.println("Quantos funcionário você possui? ");
			funcionarios = ler.nextInt();
		}
		return funcionarios;
	}
	
	public int desempregado() {
		int mesesDesempregado = 0;
		
		if (categoria == categoria.DESEMPREGADO) {
			System.out.println("Quantos meses esta desempregado? ");
			mesesDesempregado = ler.nextInt();
		}
		return mesesDesempregado;
	}
	public int l() {
		int beneficio = 1500;
		beneficio = (beneficio * 6);
		
		 return beneficio;
	}
	
	public int u() {
		int beneficio = 1000;
		beneficio = (beneficio * 3);
		
		return beneficio;
	}
	
	public boolean a() {
		int idade;
		System.out.println("Digite sua idade?");
		idade= ler.nextInt();
		
		if(idade < 18) {
			System.out.println("Você é menor de idade...");
			return false;
		}else {
			return true;
		}
	}
	
	
	public double n() {
		double beneficio = 0;
		if (estado == "SANTA CATARINA") {
			if(categoria == categoria.DESEMPREGADO) {
				beneficio = 1500;
				beneficio += (beneficio * 0.5);
			}
			
			if(categoria == categoria.EMPREGADO) {
				beneficio  = 1000;
				beneficio += (beneficio * 0.5);
			}
			
			if(categoria == categoria.EMPREGADOR) {
				beneficio = (200 * empregador());
				beneficio += (beneficio * 0.5);
			}
		}
		return beneficio;
	}
	
	public double g() {
		double beneficio = 0;
		if (empregador() <= 10) {
			beneficio = (empregador() * 200);
			beneficio += (beneficio * 1.8);
		}
		
		return beneficio;
	}
	
	
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	
	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public ArrayList<AuxilioEmergencial> getEmpregados() {
		return empregados;
	}

	public void setEmpregados(ArrayList<AuxilioEmergencial> empregados) {
		this.empregados = empregados;
	}

	public Scanner getLer() {
		return ler;
	}

	public void setLer(Scanner ler) {
		this.ler = ler;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	
	public String toString() {
		return "[Nome Completo: " + getNomeCompleto() + ", Data Nascimento: " + getDataNasc() + //
				", Categoria " + categoria + ", Desempregado receberam: " + l() +"por meses 6 meses" + //
				", Empregados receberam: " + u() + "por 3 meses" + ", Usuario é maior de idade? " + a() + //
				", Para o beneficio para quem mora em Santa Catarina é de 18% seu beneficio será: " + n() + //
				", Para os Empregador que tiver atá 10 funicionário receberá 200R$ por funcionário seu beneficio será: " + g() +  "]";
		
	}
	 
	
}