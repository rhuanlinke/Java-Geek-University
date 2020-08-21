package br.com.geekuniversity.s08orientacobjetos;
//Classes
/* - O nome das classes inicia cada palavra com letra maiuscula;
 * - N�o cont�m: acentua��o, caracteres especiais, espa�o;
 * - Nas classes Java, n�o existe a implementa��o da fun��o main();
 * - O nome da classe Java DEVE ser o mesmo nome do arquivo java;
 * - Toda classe Java possui a seguinte forma:
 public class NomeDaClasse{
  } */

//Atributos
/* - S�o as caracter�sticas da classe/molde/modelo de dados; 
 * - Podemos entender atributos/estados como vari�veis da classe;
 * - Atributos s�o nomeados em letras minusculas, sem carac. espec.*/

//M�todos
/* - Podemos entender os m�todos como a a��o que � realizada por um objeto da classe;
 * - Podemos entender tamb�m que os m�todos s�o comportamentos dos objetos da classe;
 * - Mesmos requisitos para fun��es:
 * 		a)Tipo de retorno (Tipo de dado que a fun��o vai retornar);
 * 		b) Nome - Corresponde a a��o que a fun��o realiza;
 * 		c) Par�metros/Argumentos de entrada (opcional);
 * 		d) Retorno (Opcional - depende do tipo de retorno);
 * - DIFEREN�AS: M�todo faz parte de uma classe. Fun��o n�o!
 */

public class Produto {
	String nome;
	float preco, desconto;
	
	//M�todo para aumentar o pre�o do produto em R$10
	void aumentar_preco(float valor) {
		this.preco = this.preco + valor;
	}
	
}
