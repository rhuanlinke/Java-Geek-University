// Instru��o Switch
public class Programa06 {
	public static void main(String[] args) {
		int numero = -1;
		
		switch (numero) {
			case 1:
				System.out.println("O nro � 0");
				break;
			case 3:
				System.out.println("O nro � 3");
				break;
			case 5:
				System.out.println("O nro � 5");
				break;
			default:
				System.out.println("[Defalut] O nro � "+numero);
				break;
		}
	}
}
