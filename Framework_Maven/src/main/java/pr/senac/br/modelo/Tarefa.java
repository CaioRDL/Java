package pr.senac.br.modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tarefa {
	private long id;
	private String descricao;
	private boolean finalizado;
	
	
//	long id, String descricao, boolean finalizado
	public Tarefa() {
		this.id = id;
		this.descricao = descricao;
		this.finalizado = finalizado;
		
	}

	@Id
	@GeneratedValue

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public boolean isFinalizado() {
		return finalizado;
	}


	public void setFinalizado(boolean finalizado) {
		this.finalizado = finalizado;
	}


	@Override
	public String toString() {
		return "Tarefa [id=" + id + ", descricao=" + descricao + ", finalizado=" + finalizado + "]";
	}
	
	

}
