package br.com.geekuniversity.s08orientacobjetos;
//Classes

//Atributos

//Métodos

//Construtores
/*Sempre um construtor vazio tem a seguinte forma:
 public NomeDaClasse(){}  */
public class Pessoa {
	String nome, email, endereco_rua;
	int ano_nascimento, endereco_numero, endereco_cep;
	
	//Metodo construtor vazio criado autom. pela JVM
	public Pessoa () {
		
	}
	
	//Metodo construtor com parâmetros
	public Pessoa (String nome, String email, int ano_nascimento) {
		this.nome = nome;
		this.email = email;
		this.ano_nascimento = ano_nascimento;
		//this == neste objeto, com atributo ano_nascimento. 
		//COLOQUE o valor de ano_nascimento que está vindo como parâmetro.
	}
	
	void imprime_informacoes() {
		System.out.println(this.nome);
		System.out.println(this.email);
		System.out.println(this.ano_nascimento+"\n");
	}
	
}