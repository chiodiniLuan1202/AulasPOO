package Exer02;

public class Aparelho {
	
	private String marca;
	private String modelo;
	private int Estado = 0;
	
	
	
	public Aparelho(String marca, String modelo) {
		this.marca= marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;
		
	}
	
	public String getModelo() {
		return modelo;
		
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aparelho other = (Aparelho) obj;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		return true;
	}
	
	
	public void onOff() {
		if(this.Estado == 1) {
			this.Estado = 0;
			System.out.println("O aparelho está desligando");
		}else {
			System.out.println("O aparelho está ligando");
		}
		
	}
}
