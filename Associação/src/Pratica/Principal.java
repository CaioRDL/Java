package Pratica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta cnt1 = new Conta(1519,759.20f);
		Cliente cli1 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com");
		
		Cliente cli2 = new Cliente("02950338954",1978,"Marcos Paulo Nunes","marquito@gmail.com");
		Conta cnt2 = new Conta();
		
		Cliente cli3 = new Cliente("03598268790",1990,"João Cunha", "cunha@gmail.com");
		Conta cnt3 = new Conta();
		
		
		cli2.setConta(new Conta(2374,1500.00f));//Associação 
		cli3.setConta(new Conta(3322,1200.00f));//Associação 
		
		System.out.println("Instanciando um objeto e associando-o a uma classe");
		System.out.println("");
		
		cli1.setConta(cnt1);
		
		
		
		System.out.println("");
		
		System.out.println(cli1.toString());
		
		System.out.println("Creditando 100 Reais");
		System.out.println(cli1.toString());
		System.out.println("----------------------------------");
		cnt1.creditaSaldo(100.00);
		
		System.out.println("Debitando Saldo 2750 Reais");
		cnt1.debitaSaldo(2750.00);
		
		System.out.println(cli1.toString());
		
		
		
		System.out.println(cli2.toString());
		
		cnt2.creditaSaldo(75.00);
		cnt2.debitaSaldo(150.00);
		
		
		System.out.println(cli3.toString());
		
		
	}

}
