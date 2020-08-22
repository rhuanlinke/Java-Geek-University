package br.com.geekuniversity.s11modacesso;

public class ContaBanc {
	int numero;
	float saldo;
	float limite;
	Cliente cliente;
	
	public ContaBanc(int numero, float saldo, float limite, Cliente cliente) {
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldo;
		this.cliente = cliente;
		
	}
	
	void sacar(float valor) {
		this.saldo = this.saldo - valor;
	}
	
	void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
}
