//Construtor
/*
 * - Construtor de uma classe SEMPRE tem o mesmo nome da classe;
 * - Por padr�o, a JVM (Java Virtual Machine) cria em tempo de execu��o
um construtor padr�o - um construtor vazio (com nenhum par�metro de entrada);
 * - Podemos ter mais de um construtor na classe;
 */

public class Programa24 {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa(); //(Metodo) Construtor da classe Pessoa
		
		pessoa1.nome = "Felicity Jones";
		pessoa1.email = "felicity@gmail.com";
		pessoa1.ano_nascimento = 1986;
		
		pessoa1.imprime_informacoes();
		/*System.out.println(pessoa1.nome);
		System.out.println(pessoa1.email);
		System.out.println(pessoa1.ano_nascimento+"\n");*/
		
		//Construtor que recebe par�metros
		Pessoa pessoa2 = new Pessoa("Angelina Jolie","angelina@gmail.com",1976);
		pessoa2.imprime_informacoes(); //imprime_informacoes � um metodo
	 
	}

}