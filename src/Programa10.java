/*Foreach // Para cada //For each lê todas as informações dentro 
de uma variavel e para cada uma delas faz algo na tela (nesse caso estamos 
transformando cada letra em um vetor, e trazendo este vetorn a tela.*/
public class Programa10 {

	public static void main(String[] args) {
		String nome = "Geek University";
		
		//Para cada um dos caracteres da string, imprima o caractere
		for (char letra : nome.toCharArray()) {
			System.out.print(letra);//linha inteira

			//System.out.println(letra);

		}
	}

}
