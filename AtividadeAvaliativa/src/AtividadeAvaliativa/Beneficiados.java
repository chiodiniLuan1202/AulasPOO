package AtividadeAvaliativa;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Beneficiados {

	private String nomeCompleto;
	private String dataNasc;
	private int idade;
	private Categoria categoria;
	private String estado;
	private double valorTotal;
	private double valorBeneficio;
	private double tempoDesempregado;
	private boolean aposentado;
	private int desempregado;
	private int tempoBeneficio;
	private boolean saoPaulo;

	public Beneficiados(String nomeCompleto, int idade, String dataNasc, Categoria categoria, String estado,
			boolean aposentado, int desempregado ) {
		if (idade < 18) {
			System.err.print("Voce nao tem direito ao beneficio por nao ter 18 anos" + "\n");
		} else {
			this.idade = idade;
		}
		this.nomeCompleto = nomeCompleto;
		this.dataNasc = dataNasc;
		this.categoria = categoria;
		this.estado = estado;
		if (aposentado == true) {
			this.aposentado = aposentado;
			aposentado();
			tempoBeneficio = 6;
		} else {
			this.aposentado = aposentado;
		}
		if (categoria == categoria.DESEMPREGADO) {
			{
				this.valorBeneficio = 1500;
			}
		} else if (categoria == categoria.EMPREGADO) {
			this.valorBeneficio = 1000;
		}else {
			this.valorBeneficio = 200;
		}
		
		if (desempregado < 6) {
			this.desempregado = desempregado;
			reducao6meses();
		} else {
			this.desempregado = desempregado;
		}
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public int getTempoBeneficio() {
		return this.tempoBeneficio = 2;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public double getValorBeneficio() {
		return valorBeneficio * this.tempoBeneficio;
	}

	public String getEstado() {
		return estado.toUpperCase().trim();
	}

	public double moraSaoPaulo() {
		return  (this.valorBeneficio * (10 / 100)) + this.valorBeneficio;
	}

	public double moraPara() {
		return (this.valorBeneficio * (9 / 100)) + this.valorBeneficio;
	}

	public double reducao6meses() {
		return this.valorBeneficio - (this.valorBeneficio * (10 / 100));
	}

	public double aposentado() {
		return this.valorBeneficio * 6;
		
	}
	
	public void listarCadastros() {
		
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT ID, NOME, DATA_NASCIMENTO, CATEGORIA, IDADE, ESTADO, VALOR_BENEFICIO,TEMPO_BENEFICIO from BENEFICIADOS";
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				System.out.println("Id: " + resultSet.getInt("id"));
				System.out.println("Nome: " + resultSet.getString("nome"));
				System.out.println("Data Nascimento: " + resultSet.getString("data_nascimento"));
				System.out.println("Categoria: " + resultSet.getString("categoria"));
				System.out.println("Idade: " + resultSet.getInt("idade"));
				System.out.println("Estado: " + resultSet.getString("estado"));
				System.out.println("Valor Beneficio: " + resultSet.getInt("valor_beneficio"));
				System.out.println("Tempo Beneficio: " + resultSet.getString("tempo_beneficio"));
			}
			
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}
	
	public void listarTotalUsuarios() {	
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT COUNT(*) from BENEFICIADOS";
			ResultSet resultSet = statement.executeQuery(select);
		
			System.out.println("Total de usuarios lidos: " + resultSet.getInt("count(*)"));
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
		
	}
	
	public void listarTotalBeneficiarios() { 
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT COUNT(*) from BENEFICIADOS";
			ResultSet resultSet = statement.executeQuery(select);
		
			System.out.println("Total de usuarios Beneficiados: " + resultSet.getInt("count(*)"));
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}
	
	public void listarTotalValorConcebido() {
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT SUM(valor_beneficio) AS TOTAL from BENEFICIADOS";
			ResultSet resultSet = statement.executeQuery(select);
		
			System.out.println("Total de usuarios Beneficiados: " + resultSet.getDouble("total"));
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}
	
	public void listarMaiorValor() {
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT MAX(VALOR_BENEFICIO) from BENEFECIARIO";
			ResultSet resultSet = statement.executeQuery(select);
		
			System.out.println("Maior valor Beneficiados: " + resultSet.getDouble("MAX(valor_beneficio)"));
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}
	
	public void listarMaiorTempo() {
		try {
			Statement statement = conn.createStatement();
			String select = "SELECT MAX(TEMPO_BENEFICIO) from BENEFECIARIO";
			ResultSet resultSet = statement.executeQuery(select);
		
			System.out.println("Maior valor Beneficiados: " + resultSet.getDouble("MAX(tempo_beneficio)"));
			System.out.println(".....................");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}
	
	@Override
	public String toString() {

		return "nome: " + this.nomeCompleto + "\n" + "Data Nascimento: " + this.dataNasc + "\n" + "Categoria: "
				+ this.categoria + "\n" + "Idade: " + this.idade + "\n" + "Estado: " + this.estado + "\n"
				+ "Valor Beneficio R$: " + this.valorBeneficio + "\n" + "Tempo Beneficio: " + getTempoBeneficio() + "\n"
				+ "Regras:" + "\n" + "O benefício de pessoas que moram em São Paulo terá acréscimo de 10%;" + "\n"
				+ "O benefício só será concedido para maiores de 18 anos;" + "\n"
				+ "O benefício de pessoas que moram no Pará terá acréscimo de 9%;" + "\n"
				+ "O Se estiver desempregado há menos de 6 meses terá uma redução de 10%;" + "\n"
				+ "O benefício será de 6 meses para aposentados ?";

	}
}

