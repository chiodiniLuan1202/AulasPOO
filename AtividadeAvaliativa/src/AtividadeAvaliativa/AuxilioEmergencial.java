package AtividadeAvaliativa;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AuxilioEmergencial {

	public AuxilioEmergencial() {
	}

	public void insertBeneficiado() {
		Scanner teclado = new Scanner(System.in);
		Beneficiado beneficiado = new Beneficiado();

		System.out.println("Digite seu nome completo:");
		beneficiado.setNomeCompleto(teclado.nextLine());

		System.out.println("Digite sua situação: 1-EMPREGADO, 2-DESEMPREGADO, 3-EMPREGADOR");
		int opcao = teclado.nextInt();

		if (opcao == 1) {
			beneficiado.setCategoria(Categoria.EMPREGADO);
			beneficiado.setValorBeneficio(200);
		} else if (opcao == 2) {
			beneficiado.setCategoria(Categoria.DESEMPREGADO);
			beneficiado.setValorBeneficio(1500);
			System.out.println("A quanto tempo está desempregado?");
			beneficiado.setDesempregado(teclado.nextInt());
			if (beneficiado.getDesempregado() < 6) {
				beneficiado.reducao6meses();
			}
			teclado.nextLine();
		} else if (opcao == 3) {
			beneficiado.setCategoria(Categoria.EMPREGADOR);
			beneficiado.setValorBeneficio(1000);
		}

		teclado.nextLine();
		System.out.println("Digite sua data de nascimento:");
		beneficiado.setDataNasc(teclado.nextLine());
		System.out.println("Informe sua Idade");
		beneficiado.setIdade(teclado.nextInt());
		if (beneficiado.getIdade() < 18) {
			System.err.print("Voce nao tem direito ao beneficio por nao ter 18 anos" + "\n");
		}
		teclado.nextLine();
		System.out.println("Informe seu Estado: ");
		beneficiado.setEstado(teclado.nextLine().trim());
		System.out.println("É aposentado 1- sim e 2- não ?");
		int apos = teclado.nextInt();
		teclado.nextLine();
		if (apos == 1) {
			beneficiado.setAposentado(true);
		} else {
			beneficiado.setAposentado(false);
		}
		if (beneficiado.isAposentado()) {
			beneficiado.aposentado();
			beneficiado.setTempoBeneficio(6);
		}

		if (beneficiado.getEstado() == "SP") {
			beneficiado.moraSaoPaulo();
		} else if (beneficiado.getEstado() == "PA") {
			beneficiado.moraSaoPaulo();
		}

		persisteBeneficiado(beneficiado);
		teclado.close();
	}

	public void listarCadastros() {

		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT ID, NOME, DATA_NASCIMENTO, CATEGORIA, IDADE, ESTADO, VALOR_BENEFICIO,TEMPO_BENEFICIO from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			while (resultSet.next()) {
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
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT COUNT(*) from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			System.out.println("Total de usuarios lidos: " + resultSet.getInt("count(*)"));
			System.out.println(".....................");

		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}

	}

	public void listarTotalBeneficiarios() {
		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT COUNT(*) from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			System.out.println("Total de usuarios Beneficiados: " + resultSet.getInt("count(*)"));
			System.out.println(".....................");

		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}

	public void listarTotalValorConcebido() {
		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT SUM(valor_beneficio) AS TOTAL from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			System.out.println("Total de usuarios Beneficiados: " + resultSet.getDouble("total"));
			System.out.println(".....................");

		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}

	public void listarMaiorValor() {
		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT MAX(VALOR_BENEFICIO) from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			System.out.println("Maior valor Beneficiados: " + resultSet.getDouble("MAX(valor_beneficio)"));
			System.out.println(".....................");

		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}

	public void listarMaiorTempo() {
		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement statement = conn.createStatement();
			String select = "SELECT MAX(TEMPO_BENEFICIO) from BENEFECIADO";
			ResultSet resultSet = statement.executeQuery(select);

			System.out.println("Maior valor Beneficiados: " + resultSet.getDouble("MAX(tempo_beneficio)"));
			System.out.println(".....................");

		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
	}

	public void mostrarBeneficiado() {
		Scanner teclado = new Scanner(System.in);
		int codigo = 0;

		System.out.println("Insira o código do usuário");
		codigo = teclado.nextInt();
		String select = "SELECT ID, NOME from BENEFECIADO WHERE ID =" + codigo;
		teclado.nextLine();

		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(select);

			System.out.println("Código: " + rs.getInt("id") + "Nome:" + rs.getString("nome"));

			System.out.println("Se deseja excluir este registro, aperte 1.");

			int opção = teclado.nextInt();

			if (opção == 1) {
				deletarBeneficiado(codigo);
			}
		} catch (SQLException e) {
			System.out.println("Cadastro não encontrado");
		}
		teclado.close();
	}

	private void deletarBeneficiado(int codigo) {
		String delete = "delete from beneficiado where id =" + codigo;

		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement st = conn.createStatement();
			st.execute(delete);

			System.out.println("Beneficiado foi excluído dos registros.");
		} catch (SQLException e) {
			System.out.println("não foi possível excluir este registro.");
		}
	}

	private void persisteBeneficiado(Beneficiado beneficiado) {
		String comando = "CREATE TABLE IF NOT EXISTS BENEFICIADO("//
				+ "id serial not null,"//
				+ "nome varchar(40) not null,"//
				+ "data_nascimento varchar(15) not null,"//
				+ "categoria int(8) not null,"//
				+ "idade varchar(10) not null,"//
				+ "valor_beneficio double(8) not null,"//
				+ "tempo_beneficio varchar(15) not null);";

		try {
			Connection conn = new ConnectionFactory().getConnection();
			Statement st = conn.createStatement();
			st.execute(comando);

			String insert = "INSERT INTO BENEFECIADO (NOME, DATA_NASCIMENTO, CATEGORIA, IDADE, ESTADO, VALOR_BENEFICIO,TEMPO_BENEFICIO)"
					+ "values (" + beneficiado.getNomeCompleto() + "," + beneficiado.getDataNasc() + ","
					+ beneficiado.getCategoria().ordinal() + "," + beneficiado.getIdade() + ","
					+ beneficiado.getEstado() + "," + beneficiado.getValorBeneficio() + ","
					+ beneficiado.getTempoBeneficio() + ");";

			st.execute(insert);
		} catch (SQLException e) {
			System.out.println("Não foi possível salvar este registro! " + e.getMessage());
		}
	}

}