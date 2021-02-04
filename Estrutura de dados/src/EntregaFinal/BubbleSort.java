package EntregaFinal;

public class BubbleSort {

	private int vetor[];
	
	public void bubbleSort() {
		int it;
		int pos;
		int temp;
		
		for(it = 0; it < vetor.length - 1; it++ ) {
			for(pos = 0;pos < vetor.length - 1; pos++) {
				if(vetor[pos] > vetor[pos+1] ) {
					
					temp = vetor[pos];
					vetor[pos] = vetor[pos-1];
					vetor[pos + 1]= temp;		
				}
			}
			
			System.out.println("Final da interação");
			monstraVetor();
		}
	}
	
	public void monstraVetor() {
		for(int i=0; i<vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
		System.out.println("");
		
	}
}
