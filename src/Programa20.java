import java.util.Scanner;

/*
 * Uma fun��o deve ter o seguinte:
 * a)Tipo de retorno (Tipo de dado que a fun��o vai retorar);
 * b)Nome - Corresponde a a��o que a fun��o realiza;
 * c)Par�metros/Argumentos de entrada (Opcional)
 * d)Retorno(Opcional - depende do tipo de retorno)
*/

//Criando nossas pr�prias fun��es
/*
Fa�a um programa que receba diversos nomes de frutas
do usu�rio e no final imprima essas frutas em ordem contr�ria.
Solicitar ao usu�rio quantas frutas ele quer informar.

Inforem quantas frutas deseja cadastrar:

Informe o nome de uma fruta:
Manga
Informe o nome de uma fruta:...
Goiba

Goiaba
Manga
*/
public class Programa20 {
	public static void main(String[] args) {
		//Vari�vel local
		int qtd;
		
		System.out.println("Informe quantas frutas deseja cadastrar: ");
		qtd = Integer.parseInt(teclado.nextLine());
		
		cadastrar_dados(qtd);
		mostrar_dados(qtd);

		teclado.close();
		

				
	}
	
	//Vari�veis globais
	static Scanner teclado = new Scanner(System.in);
	//criando o vetor \/
	static String frutas[];
	
	static void cadastrar_dados(int quantidade) {
		//definindo o tamanho do vetor \/
		frutas = new String[quantidade];
		
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Informe a "+ (i + 1) + " fruta: ");
			frutas[i] = teclado.nextLine();
		}
		
	}
	
	
	static void mostrar_dados(int quantidade) {
		for (int i =(quantidade -1); i >= 0; i--) {
			System.out.println(frutas[i]);
		}
		
	}
}
