package Pratica;

public class Poupanca extends Conta {
	public int aniversario;
	
	Conta conta = new Conta();
	
	public Poupanca(int numero, float saldo,int aniversario) {
		super(numero,saldo);
		this.aniversario = aniversario;
		
		
	}
	
	public Poupanca() {
		
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
	public String toString() {
		return "Poupanca [aniversario=" + aniversario + ", numero=" + numero + ", saldo=" + saldo
				+ "]";
	}


	

}
