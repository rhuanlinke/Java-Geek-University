// Instrução Switch
public class Programa06 {
	public static void main(String[] args) {
		int numero = -1;
		
		switch (numero) {
			case 1:
				System.out.println("O nro é 0");
				break;
			case 3:
				System.out.println("O nro é 3");
				break;
			case 5:
				System.out.println("O nro é 5");
				break;
			default:
				System.out.println("[Defalut] O nro é "+numero);
				break;
		}
	}
}
