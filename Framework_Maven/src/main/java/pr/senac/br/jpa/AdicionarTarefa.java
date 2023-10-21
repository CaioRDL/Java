package pr.senac.br.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import pr.senac.br.modelo.Tarefa;

public class AdicionarTarefa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Tarefa tarefa = new Tarefa();
//		
//		tarefa.setDescricao("Estudar JPA e Hibernate");
//		tarefa.setFinalizado(true);
//		
//		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
//		EntityManager manager = factory.createEntityManager();
//		
//		manager.getTransaction().begin();
//		
//		manager.persist(tarefa);
//		
//		manager.getTransaction().commit();
//		
//		System.out.println("ID TAREFA " + tarefa.getId());
//		
//		manager.close();
		
		//---------------------------------------------------------------------------------------
		
		Tarefa tarefa = new Tarefa();
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("jpa_exemplo");
		
		EntityManager manager = factory.createEntityManager();
		
		
		
		try {
			
			Tarefa encontrada = manager.find(Tarefa.class, 2l);
			
			System.out.println(encontrada.getDescricao());
			
		}catch(Exception e) {
			System.out.println("ID Solicitado não encontrado");
			System.out.println(e.getMessage());
		}
		
		manager.close();
		
		
		
		
		

	}

}
