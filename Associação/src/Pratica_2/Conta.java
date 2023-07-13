package Pratica_2;

public class Conta{
	private int numero;
	private double saldo;
	
	
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	public Conta() {
		super();
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void creditaSaldo(double valorCreditado){
		this.saldo = this.saldo + valorCreditado;
	}
	
	public void debitaSaldo(double valorDebitado){
		this.saldo = this.saldo - valorDebitado;
	}


	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	
}



