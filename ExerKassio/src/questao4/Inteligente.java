package questao4;

public class Inteligente extends SalaAula {

	private boolean computadorAluno;
	
	public Inteligente(int capacidade, String id,String titulo) {
		super(capacidade,id,titulo);
	}

	public boolean isComputadorAluno() {
		return computadorAluno;
	}

	public void setComputadorAluno(boolean computadorAluno) {
		this.computadorAluno = computadorAluno;
	}
	
	
}