package Exer02;

public class Televisor extends Aparelho{
	
	private int polegadas;
	private int canal;
	
	public Televisor(String marca, String modelo, int polegadas) {
		super(marca, modelo);
		this.polegadas = polegadas;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int setCanal(int canal) {
		if(Estado ==1) {
			if (canal > 999) {
				canal = 1 ;
			}else if(canal < 1 ){
				canal = 999;
			}this.canal = canal;
		
		}
		return canal;
	}
	
	public void canalMais() {
		setCanal(canal + 1);
	}
	
	public void canalMenos() {
		setCanal(canal - 1);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + canal;
		result = prime * result + polegadas;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Televisor other = (Televisor) obj;
		if (canal != other.canal)
			return false;
		if (polegadas != other.polegadas)
			return false;
		return true;
	}
	
	
	
	

}
