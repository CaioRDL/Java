package Pratica;

public class Conta {
	public int numero;
	public float saldo;
	
	
	public Conta(int numero, float saldo) {
		this.numero = numero;
		this.saldo = saldo;
		
	}
	
	public Conta() {
		
	}
	
	
	public boolean debitaSaldo(float valorDebitado){
		//this.saldo = this.saldo - valorDebitado;
		
		if(valorDebitado > this.saldo) {
			System.out.println("Valor não debitado");
			return false;
		}else {
			System.out.println("Valor acrescentado");
			this.saldo = this.saldo - valorDebitado;
			
			return true;
		}
		
	}
	


}
