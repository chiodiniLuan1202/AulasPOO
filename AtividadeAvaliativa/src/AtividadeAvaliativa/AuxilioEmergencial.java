package AtividadeAvaliativa;

import java.util.ArrayList;

public class AuxilioEmergencial {
	
	private ArrayList<Beneficiados> beneficiados=new ArrayList<>();
	
	public AuxilioEmergencial() {
		
	}

	public void addBeneficiados(Beneficiados b) {
		beneficiados.add(b);
	}
	
	public ArrayList<Beneficiados> listarBeneficiados(){
			return beneficiados;
	}
	
	public Beneficiados maiorValor() {
		Beneficiados maiorValor = null;
		for(Beneficiados b :beneficiados) {
				if(maiorValor == null||b.getValorBeneficio()<maiorValor.getValorBeneficio()) {
					maiorValor=b;
				}
		}
		return maiorValor;
	}
	
	public Beneficiados maiorTempo() {
		Beneficiados maiorTempo = null;
		for(Beneficiados b :beneficiados) {
				if(maiorTempo == null||b.getTempoBeneficio()<maiorTempo.getTempoBeneficio()) {
					maiorTempo=b;
				}
		}
		return maiorTempo;
	}
	public int contarElementos() {
		return beneficiados.size();
	}
	
}