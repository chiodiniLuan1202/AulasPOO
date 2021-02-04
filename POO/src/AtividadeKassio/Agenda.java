package AtividadeKassio;

public class Agenda {
	
	private Contato contatos[] = new Contato[5];
	
	public Contato[] getContatos(){
		return contatos;
	}
	
	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	
	public void listar() {
		for(int i=0; i< contatos.length; i++) {
			Contato contato = contatos[i];
			if(contato != null) {
				System.out.println("Nome: "+ contato.getNome());
				System.out.println("Email: "+ contato.getEmail());
				System.out.println("...");
			}	
		}
	}
	
	public void excluir() {	
		
	}
	
	public void incluir() {	
			
		}

	public void alterar() {	
		
	}
	
	
	
}
