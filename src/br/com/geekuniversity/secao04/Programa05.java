package br.com.geekuniversity.secao04;
//Operador ternário

//Se você precisar criar a função main() //programa java
//Digite main e pressione CTRL + barra de espaço + enter
public class Programa05 {
	
	public static void main(String[] args) {
		int numero, valor = -3;
		
		/*if(valor > 0) {
			numero = valor;
		}else {
			numero = 7
		}
		*/
		//Operador ternário // Só funciona com if else simples
		//Verdadeiro : falso
		numero = (valor > 0) ? valor : 7; 
		
		//Digite sysout + CTRL + barra de espaço + enter
		System.out.println(numero);
	}
}
