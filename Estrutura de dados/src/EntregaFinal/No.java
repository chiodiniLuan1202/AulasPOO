package EntregaFinal;

public class No {
		
		int valor;
		public No esq;
		public No dir;
		
		public No (int valor) {
			this.valor = valor;
			this.esq = null;
			this.dir = null;
			
		}
		
		public No(int valor, No esq, No dir) {
			this.valor = valor;
			this.esq = esq;
			this.dir = dir;
		}

		public No getFilhoEsquerda() {
			return esq;
		}
		
		public No getFilhoDireita() {
			return dir;
		}

		public Object getConteudo() {
			return valor;
		}
		
		
		
		
}
