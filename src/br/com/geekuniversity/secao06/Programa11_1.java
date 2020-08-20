package br.com.geekuniversity.secao06;
import java.util.Scanner;

//Revisando conhecimento
public class Programa11_1 {
	public static void main(String[] args) {
		int aluno, turma, i, y;
		
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Quantos professores a turma tem?");
		y = teclado.nextInt();
		
		int professor[] = new int[y];
		
		for(i=0;i<y;i++) {
			System.out.println("Qual seu código de professor?");
			professor[i] = teclado.nextInt();
		}
		
		for(i=0;i<y;i++) {
			System.out.println(professor[i]);
		}
		
		
	}
}
