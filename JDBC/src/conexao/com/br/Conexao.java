package conexao.com.br;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexao {
	public static void main(String[] args) {
		Connection conn = new ConnectionFactory().getConnection();
		
		String comando = "CREATE TABLE IF NOT EXISTS BENEFICIARIO ("
				+ "id serial not null,"
				+ "nome varchar(40) not null,"
				+ "telefone varchar(15) not null);";
		
		
		
		try {
			Statement statement = conn.createStatement();
			statement.execute(comando);
			
			String insert = "INSERT INTO BENEFICIARIO (nome, telefone) values ('Ronaldinho Gaucho','+5547912341232');"
					+ "INSERT INTO BENEFICIARIO (nome, telefone) values ('Pele','+5547912341234');"
					+ "INSERT INTO BENEFICIARIO (nome, telefone) values ('Ronaldo Fenomeno','+5547912341235');"
					+ "INSERT INTO BENEFICIARIO (nome, telefone) values ('Kaka','+5547912341236');"
					+ "INSERT INTO BENEFICIARIO (nome, telefone) values ('Robinho','+5547912341237');";	
			
			statement.execute(insert);
			
			String delete = "DELETE from BENEFICIARIO WHERE id = 2;";
			statement.execute(delete);
			
			String update = "UPDATE BENEFICIARIO SET id = 10 WHERE id = 3; ";
			statement.execute(update);
			
			
			String select = "SELECT ID, NOME, TELEFONE from BENEFICIARIO";
			ResultSet resultSet = statement.executeQuery(select);
			
			while(resultSet.next()) {
				System.out.println("Id: " + resultSet.getInt("id"));
				System.out.println("Nome: " + resultSet.getString("nome"));
				System.out.println("telefone: " + resultSet.getString("telefone"));
			}
			
			
			
			System.out.println("Comando executado...");
			
		} catch (Exception e) {
			System.out.println("Deu ruim codigo......");
		}
		
		
		
		
		
		}
}
