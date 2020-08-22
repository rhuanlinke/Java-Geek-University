package br.com.geekuniversity.s11modacesso;

public class Programa25 {

	public static void main(String[] args) {
		Cliente joao = new Cliente("João da Silva", "Av Souza Melo 1084");
		Cliente maria = new Cliente ("Maria da Silva", "Av Souza Melo 1084");
		
		ContaBanc conta_joao = new ContaBanc(1, 100.0f, 200.0f, joao);
		ContaBanc conta_maria = new ContaBanc(2, 300.0f, 500.0f, maria);
		
		System.out.println("Saldo do João: "+ conta_joao.saldo);
		System.out.println("Saldo da Maria: "+ conta_maria.saldo);
		
		conta_joao.sacar(300.0f);
		System.out.println("Saldo do João: "+ conta_joao.saldo);
	}

}