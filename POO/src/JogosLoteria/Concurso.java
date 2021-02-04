package JogosLoteria;

public class Concurso {

	private static int[] vetResultado;

	public static int[] resultado() {
		if (vetResultado == null) {
			vetResultado = new int[6];
			Random rd = new Random();
			int num;
			for (int i = 0; i < vetResultado.length; i++) {
				do {
					num = 1 + rd.nextInt(60);
				} while (jaTem(num));
				vetResultado[i] = num;
			}
		}
		return vetResultado;
	}

	private static boolean jaTem(int n) {
		for (int x : vetResultado) {
			if (x == n) {
				return true;
			}
		}
		return false;
	}

	
}
