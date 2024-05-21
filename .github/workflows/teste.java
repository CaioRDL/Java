package trabalho01;

public class Cadastro {

	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	public Cadastro() {
		super();
	}
	
	
	public boolean confirmaSenha(String senha1, String senha2) { 
		boolean i = true;
		String s = senha1;
		String ss = senha2;
		
		if (s != ss) {	
			i = false;
		}
		else {
			i = true;
		}
		System.out.println(i);
		return i;
	}
	
	


}
