package br.com.geekuniversity.secao06;

public class Programa13 {
	public static void main(String[] args) {
		//Tipos primitivos
		char letra1 = 'a';
		char letra2 = 63; //63 em decimal � == ?
		//char letra4 = "b"; //errado! qualquer coisa entre aspas duplas � uma string
		
		letra2 = (char) (letra2 + 1); //cast informo em 1 o que o 2 vai ser considerado
		//64 � @		
		System.out.println(letra1+" "+letra2);
		
		//Tipos n�o primitivos
		Character letra3 = 'A';
		String nome = "Geek University";
		
		System.out.println(letra3);
		
		System.out.println(Character.SIZE * nome.length());
		
		
	}
}
