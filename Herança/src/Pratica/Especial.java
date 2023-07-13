package Pratica;

public class Especial extends Conta {
	public double limite;
		
	Conta conta = new Conta();
	public Especial() {
	}
	
	public Especial(int numero, float saldo,double limite ) {
		super(numero,saldo);
		this.limite = limite;

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public boolean debitaSaldo(float debitaSaldo) {
		
		if(debitaSaldo > (this.saldo + this.limite)) {
			System.out.println("Não");
			return false;
		}else {
			System.out.println("Sim");
			this.saldo = this.saldo - debitaSaldo;
			return true;
		}
		
		
	}


	@Override
	public String toString() {
		return "Especial [limite=" + limite + ", numero=" + numero + ", saldo=" + saldo
				+"]";
	}
	


}
