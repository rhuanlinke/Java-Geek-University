//Ainda sobre fun��es
public class Programa21 {
	public static void main(String[] args) {
		int valor1 = 6, valor2 = 4, res;
		
		//res = soma(valor1, valor2);
		
		//System.out.println("O resultado � "+res);
		
		System.out.println("O resultado � "+soma(valor1, valor2, "Ol�"));
		
		System.out.println(mensagem());
		
	}
	
	static int soma(int a, int b, String msg) {
		System.out.println(msg);
		return a + b;
	}
	
	static String mensagem() {
		return "Ol� usu�rio";
	}
}
