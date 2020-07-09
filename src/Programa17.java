//Vetores parte 2
public class Programa17 {

	public static void main(String[] args) {
		int numeros[] = new int[10];
		
		System.out.println("Tamano do vetor: "+numeros.length);
		
		
		for(int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 3;
			System.out.println(numeros[i]);

		}
		
		for(int i = 0; i < numeros.length; i++) {
			
			numeros[i] = (int)Math.round(Math.random() * 10);
			//Cast INT de Math.round (biblioteca Math que arredonda) um numero
			//No caso vai arredondar o resultado da biblioteca Math com random
			//Que randomicamente escolhe um numero entre 0 e 1 * 10
			
			System.out.println(numeros[i]);
		}
		
		for (int i : numeros) {
			System.out.println(i);
		}
		//enquanto tiver elementos em numero, ele vai mostrar o i
		
	}

}
