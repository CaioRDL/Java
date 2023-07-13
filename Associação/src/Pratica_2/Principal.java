package Pratica_2;

import Pratica_2.Conta;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente("03510400902",1985,"Ana Maria Marques","aninha@gmail.com",1519,759.20f);
		
		
		System.out.println(cli1.toString());
		System.out.println(cli1.getConta().toString());
		
		cli1.getConta().creditaSaldo(100.f);
		System.out.println(cli1.getConta().toString());
		
		cli1.getConta().debitaSaldo(2750.00f);
		System.out.println(cli1.getConta().toString());
		
		
		

	}

}
