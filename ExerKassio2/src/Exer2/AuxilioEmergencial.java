package Exer2;

import java.util.ArrayList;

public class AuxilioEmergencial {
	
	private ArrayList<Beneficiados> beneficiados=new ArrayList<>();
	
	public AuxilioEmergencial() {
		
	}

	public void addBeneficiados(Beneficiados bene) {
		beneficiados.add(bene);
	}
	
	public ArrayList<Beneficiados> listarBeneficiados(){
			return beneficiados;
	}
	
	public Beneficiados maiorValor() {
		Beneficiados maiorValor = null;
		for(Beneficiados benef :beneficiados) {
				if(maiorValor == null||benef.getValorBeneficio()<maiorValor.getValorBeneficio()) {
					maiorValor=benef;
				}
		}
		return maiorValor;
	}
	
	public Beneficiados maiorTempo() {
		Beneficiados maiorTempo = null;
		for(Beneficiados benef :beneficiados) {
				if(maiorTempo == null||benef.getTempoBeneficio()<maiorTempo.getTempoBeneficio()) {
					maiorTempo=benef;
				}
		}
		return maiorTempo;
	}
	
	
}