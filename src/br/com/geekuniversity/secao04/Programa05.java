package br.com.geekuniversity.secao04;
//Operador tern�rio

//Se voc� precisar criar a fun��o main() //programa java
//Digite main e pressione CTRL + barra de espa�o + enter
public class Programa05 {
	
	public static void main(String[] args) {
		int numero, valor = -3;
		
		/*if(valor > 0) {
			numero = valor;
		}else {
			numero = 7
		}
		*/
		//Operador tern�rio // S� funciona com if else simples
		//Verdadeiro : falso
		numero = (valor > 0) ? valor : 7; 
		
		//Digite sysout + CTRL + barra de espa�o + enter
		System.out.println(numero);
	}
}
