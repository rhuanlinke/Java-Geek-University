package br.com.geekuniversity.s05tiposddados;
//Operações matemáticas
public class Programa15 {

	public static void main(String[] args) {
		int num1 = 5, num2 = 9, res;
		float res2, num3=11f, num4 =14f;
		
		//soma
		res = num1 + num2;
		System.out.println("A soma de "+ num1 + "+" + num2 + " é " +(num1+num2)+" ou "+res);
		
		//Divisão (inteira)
		res = num2 / num1;
		System.out.println(res);
		res = (int)num4 / (int)num3;
		System.out.println(res); //resultado seria float 1.27
		
		//Divisão (real)
		res2 = (float)num2 / (float)num1; //cast vai pegar uma variavel INT e usa-la como se fosse (float)
	}

}
