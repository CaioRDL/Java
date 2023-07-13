package Pratica_4;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cl1 = new Cliente("03510400902",1985,"Ana Maria","aninha@gmail.com");
		
		Conta[] conta = new Conta[2];
		conta[0] = new Conta(1515,1500.00f);
		conta[1] = new Conta(1517,2500.00f);
		
		cl1.setConta(conta);
		
		
		System.out.println("---------------------------");
		System.out.println(cl1.toString());
		System.out.println(cl1.getConta()[0].toString());
		System.out.println(cl1.getConta()[1].toString());
		
		cl1.getConta()[0].creditaSaldo(100.00f);
		cl1.getConta()[0].debitaSaldo(2750.00f);
		
		cl1.getConta()[1].creditaSaldo(1100.00f);
		cl1.getConta()[1].debitaSaldo(3000.00f);
		
		System.out.println(cl1.toString());
		
	
		

	}

}
