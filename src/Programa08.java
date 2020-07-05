import java.util.Scanner;

//Receba dados do usuário enquanto a idade for > que 0

//do while
public class Programa08 {
	public static void main(String[] args) {
		int idade = 1;
		String nome;
		
		//Para recebre dados do usuário via teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		nome = teclado.nextLine();/*nextLine(1linha) e next(1palavra)
		 recebem String*/
		
		do { //faz o bloco e depois checa
		System.out.println("Informe sua idade: ");
		//idade = teclado.nextInt();//nextInt recebe inteiro
		idade = Integer.parseInt(teclado.nextLine());/*parseInt irá
		converter o texto recebido para Inteiro*/
		if(idade<=0) {
			System.out.println(nome+" não tem idade.");
		}
		else {
			System.out.println(nome+" tem "+idade+" anos.");

		}
		}while(idade>0);
		
		teclado.close();
		
		
		
	}

}
