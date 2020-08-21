package br.com.geekuniversity.s08orientacobjetos;
//Classes
/* - O nome das classes inicia cada palavra com letra maiuscula;
 * - Não contém: acentuação, caracteres especiais, espaço;
 * - Nas classes Java, não existe a implementação da função main();
 * - O nome da classe Java DEVE ser o mesmo nome do arquivo java;
 * - Toda classe Java possui a seguinte forma:
 public class NomeDaClasse{
  } */

//Atributos
/* - São as características da classe/molde/modelo de dados; 
 * - Podemos entender atributos/estados como variáveis da classe;
 * - Atributos são nomeados em letras minusculas, sem carac. espec.*/

//Métodos
/* - Podemos entender os métodos como a ação que é realizada por um objeto da classe;
 * - Podemos entender também que os métodos são comportamentos dos objetos da classe;
 * - Mesmos requisitos para funções:
 * 		a)Tipo de retorno (Tipo de dado que a função vai retornar);
 * 		b) Nome - Corresponde a ação que a função realiza;
 * 		c) Parâmetros/Argumentos de entrada (opcional);
 * 		d) Retorno (Opcional - depende do tipo de retorno);
 * - DIFERENÇAS: Método faz parte de uma classe. Função não!
 */

public class Produto {
	String nome;
	float preco, desconto;
	
	//Método para aumentar o preço do produto em R$10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
}
