package Pratica_3;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta cn1 = new Conta(1519,759.20f);
		Cliente cl1 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com", cn1);
		
		System.out.println(cl1.toString());
		
		cl1.getConta().creditaSaldo(100.00f);
		cl1.getConta().debitaSaldo(2750.00f);
		
		System.out.println(cl1.toString());
		
		Cliente cl2 = new Cliente("02950338954",1978,"Marcos Paulo Nunes", "marquinhos@gmail.com", new Conta(2374,1522.00f));
		
		System.out.println(cl2.toString());
		
		cl2.getConta().creditaSaldo(75.00f);
		cl2.getConta().debitaSaldo(150.00f);
		
		System.out.println(cl2.toString());

	}

}
