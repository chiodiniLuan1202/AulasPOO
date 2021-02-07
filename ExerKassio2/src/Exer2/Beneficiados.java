package Exer2;

import java.util.ArrayList;
import java.util.Scanner;

public class Beneficiados {
	
		private String nomeCompleto;
		private String dataNasc;
		private int idade;
		private Categoria categoria;
		private String estado;
		private double valorTotal;
		private double valorBeneficio;
		private double tempoDesempregado;
		private boolean aposentado;
		private int mesesDesempregado;
		private int tempoBeneficio;
		private int funcionarios;
		private Scanner ler = new Scanner(System.in);
		
		public Beneficiados(String nomeCompleto, int idade, String dataNasc, Categoria categoria, String estado,
				boolean aposentado, int mesesDesempregado) {
			if (idade < 18) {
				System.err.print("Se for menor de 18 anos, voc� n�o tera direito ao auxilio...." + "\n");
			} else {
				this.idade = idade;
			}
			this.nomeCompleto = nomeCompleto;
			this.dataNasc = dataNasc;
			this.categoria = categoria;
			this.estado = estado;
			this.mesesDesempregado = mesesDesempregado;
			if (aposentado == true) {
				this.aposentado = aposentado;
			}if (categoria == categoria.DESEMPREGADO) {
				{
					valorBeneficio = 1500;
				}
			}if(categoria == categoria.EMPREGADOR) {
				System.out.println("Quantidade empregados? ");
				funcionarios = ler.nextInt();
				
			}else if (categoria == categoria.EMPREGADO) {
					valorBeneficio = 1000;
			}
				
		}

		public String getNomeCompleto() {
			return nomeCompleto;
		}

		public int getTempoBeneficio() {
			return this.tempoBeneficio = 2;
		}

		public String getDataNasc() {
			return dataNasc;
		}

		public Categoria getCategoria() {
			return categoria;
		}

		public double getValorBeneficio() {
			return valorBeneficio * 2;
		}

		public String getEstado() {
			return estado.toUpperCase().trim();
		}
		
		public double beneficioDesempregado() {
			return (this.valorBeneficio * 6);
		}
		
		public double beneficioEmpregado() {
			return (this.valorBeneficio * 3);
		}

		public double moraSantaCatarina() {
			return valorBeneficio = (this.valorBeneficio * 0.5) + this.valorBeneficio;
		}

		public double EmpregadorBeneficio() {
			return funcionarios * 200;
		}
	
		@Override
		public String toString() {

			return "nome: " + this.nomeCompleto + "\n" + "Data Nascimento: " + this.dataNasc + "\n" + "Categoria: "
					+ this.categoria + "\n" + "Idade: " + this.idade + "\n" + "Estado: " + this.estado + "\n"
					+ "Valor Beneficio R$: " + this.valorBeneficio + "\n" +   "Tempo Beneficio: " + getTempoBeneficio()
					+ "Regras de negocios:" + "\n" + "O benef�cio ser� de 6 meses para desempregados;" + "\n"
					+ "O Benef�cio ser� de 3 meses para empregados;" + "\n"
					+ "O benef�cio s� ser� concedido para maiores de 18 anos;" + "\n"
					+ "O benef�cio de pessoas que moram em Santa Catarina ter� acr�scimo de 5%;" + "\n"
					+ "Para empregadores que tenham at� 10 funcion�rios haver� um acr�scimo de 18% sobre o valor total;";

		}
}
