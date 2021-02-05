package questao4;

public class Escritorio extends Sala{
	
	private String nomeCorpoDocente;
	private String nomeFuncionario;
	public Escritorio(int capacidade, String id,String titulo,String nomeCorpoDocente, String nomeFuncionario) {
		super(capacidade,id,titulo);
		this.nomeCorpoDocente=nomeCorpoDocente;
		this.nomeFuncionario=nomeFuncionario;
	}
	public String getNomeCorpoDocente() {
		return nomeCorpoDocente;
	}
	
	public void setNomeCorpoDocente(String nomeCorpoDocente) {
		this.nomeCorpoDocente = nomeCorpoDocente;
	}
	
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

}