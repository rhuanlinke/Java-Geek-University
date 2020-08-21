package br.com.geekuniversity.s05tiposddados;
//Tipos booleanos
public class Programa14 {
	public static void main(String[] args) {
		//Tipos primitivos
		boolean verdadeiro = true;
		boolean falso = false;
		
		//Tipos não primitivos
		Boolean v = true;
		Boolean f = false;
		
		System.out.println("Verdadeiro " + verdadeiro);
		System.out.println("Falso " + falso);
		System.out.println("V " + v);
		System.out.println("F " + f);
		
		if(verdadeiro == true) {
			System.out.println("É verdadeiro");
		}
		else {
			System.out.println("É falso");
		}
		
		if(1 == 3) {
			System.out.println("Verdadeiro");
		} else {
			System.out.println("Falso");
		}
	}
}
