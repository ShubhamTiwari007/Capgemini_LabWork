package WorkingWithHibernate_Lab2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA");
		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		
		
		Author author1 = new Author();
		author1.setName("Robert Mathew Roy");
		
		Author author2 = new Author();
		author2.setName("Adam Jones Pop");
		
		Book book1 = new Book();
		book1.setTitle("Science Fiction");
		book1.setPrice(100);
		
		
		Book book2 = new Book();
		book2.setTitle("Comedy");
		book2.setPrice(299);
		
		book1.getAuthor().add(author1);
		author1.getBook().add(book1);
		book2.getAuthor().add(author2);
		author2.getBook().add(book2);
		
		em.persist(book1);
		em.persist(author1);
		em.persist(book2);
		em.persist(author2);
		
		em.getTransaction().commit();
		
				
		em.close();
		emf.close();
	}
}
