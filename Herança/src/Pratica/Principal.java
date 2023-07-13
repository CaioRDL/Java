package Pratica;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Poupanca pop01 = new Poupanca(1789,756.90f,15);
		Especial espec01 = new Especial(3441,10522.00f,50.00);
		
		
		
		System.out.println(pop01.toString());
		System.out.println(espec01.toString());
		//System.out.println(espec02.toString());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("----------------------------------------------------------");
		
		//System.out.println(pop01.toString());
		//System.out.println(espec01.toString());
		
		System.out.println("----------------------------------------------------------");
		pop01.debitaSaldo(110.00f);
		
		espec01.debitaSaldo(50000.00f);
		
		System.out.println("----------------------------------------------------------");
		System.out.println(pop01.toString());
		System.out.println(espec01.toString());
		
		
		
		
		
		
		
	
		
		
				

	}

}
