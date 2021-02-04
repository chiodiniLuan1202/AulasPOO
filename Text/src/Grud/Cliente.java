package Grud;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escolha:");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Excluir" );
		System.out.println("3 - Editar" );
		System.out.println("4 - Listar" );
		
		int cadastro = ler.nextInt();
		
		switch(cadastro) {
		case 1:
			System.out.println("Cadastrar ");
			
			
			
			
			
			
		}
	}

	private String matricula;
	private String nome;
	private String cargo;
	
	
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public String salvar() {
		
		
		try {
			FileWriter fw = new FileWriter ("Banco.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Matricula: " + this.matricula);
			pw.println("Nome: " + this.nome);
			pw.println("Cargo: "+ this.cargo);
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		return null;
	}
}
