package questao4;

public class Sala {

	private int capacidade;
	private String id;
	private String apelido;
	private String titulo;
	
	
	public Sala(int capacidade, String id,String titulo) {
		this.capacidade = capacidade;
		this.id = id;
		this.titulo=titulo;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getApelido() {
		return apelido;
	}


	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	

}