package Prova;

public class Pessoa {
	
	private String Nome; 
	private String cpf;
	private int idade;
	private int nascimento;
	
	public Pessoa (String Nome,String cpf) {
		this.Nome = Nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return Nome;
	}
	//Não Consegui fazer!!! 
	public String FormatarCpf(String cpf) {
		return cpf;
	}
 
	public void AnoNascimento(int nascimento) {	
		this.nascimento= nascimento;
		
		int anoAtual= 2020;
		idade = (anoAtual - nascimento);
	
	}
	
	public boolean  MaiorDeIdade() {
		if(idade > 18) {
			return true;
		}else {
			return false;
		}	
	}	

}
