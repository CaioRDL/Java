package Pratica_4;

import java.util.Arrays;

public class Cliente{
	private String cpf;
	private int anoNascimento;
	private String nome;
	private String email;
	
	private Conta[] conta;
	
	
	public Cliente(String cpf, int anoNascimento, String nome, String email) {
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.nome = nome;
		this.email = email;
		
		this.conta = new Conta[2];
	}
	
	
	public Cliente() {
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}



	public Conta[] getConta() {
		return conta;
	}


	public void setConta(Conta[] conta) {
		this.conta = conta;
	}


	@Override
	public String toString() {
		return "Cliente [cpf=" + cpf + ", anoNascimento=" + anoNascimento + ", nome=" + nome + ", email=" + email
				+ ", conta=" + Arrays.toString(conta) + "]";
	}





	
}



