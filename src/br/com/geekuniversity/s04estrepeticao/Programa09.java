package br.com.geekuniversity.s04estrepeticao;
import java.util.Scanner;

//for
public class Programa09 {

	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		//Para recebre dados do usu�rio via teclado
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();/*nextLine(1linha) e next(1palavra)
		 recebem String*/
		
		//(vari�vel de controle; condi��o de parada; forma de incremento){}
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe sua idade: ");
			//idade = teclado.nextInt();//nextInt recebe inteiro
			idade = Integer.parseInt(teclado.nextLine());
			/*parseInt ir� converter o texto recebido para Inteiro*/
			if(idade<=0) {
				System.out.println(nome+" n�o tem idade.");
			}
			else {
				System.out.println(nome+" tem "+idade+" anos.");

			}
		}
		teclado.close();

	}

}
