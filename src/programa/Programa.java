package programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		//Instanciando objetos para serem gravados
		/*Pessoa p1 = new Pessoa(null, "Gabriel", "gabriel@gmail.com");
		Pessoa p2 = new Pessoa(null, "Maria", "maria@bol.com");
		Pessoa p3 = new Pessoa(null, "Eduardo", "eduardo@yahoo.com");*/
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p = em.find(Pessoa.class, 1);
		
		//Gravando no banco de Dados
		/*em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();*/
		
		//Excluindo do BD
		/*em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();*/
		
		System.out.println(p);
		
		//Sempre que há uma operação que não seja de consulta, é necessário abrir uma transação
		
		em.close();
		emf.close();
		
		System.out.println("pronto!");
	}
	
}
