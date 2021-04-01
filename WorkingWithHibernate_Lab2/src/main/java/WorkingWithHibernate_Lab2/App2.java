package WorkingWithHibernate_Lab2;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class App2 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em = emf.createEntityManager();
		Scanner sc = new Scanner(System.in);

		em.getTransaction().begin();
		
		Query query1 = em.createQuery("Select title from Book");
		List<String> bookList = query1.getResultList();
		
		bookList.forEach(e -> System.out.println(e));

		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
