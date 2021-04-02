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
		
		System.out.println("Query 1");
		Query query1 = em.createQuery("Select title from Book");
		List<String> bookList = query1.getResultList();
		
		bookList.forEach(e -> System.out.println(e));

		System.out.println("Query 2");
		System.out.print("Enter the author name: ");
		String authorName = sc.nextLine();
		Query query2 = em.createQuery("select a.books from Author a where a.name = '" + authorName+ "'");
		List<Book> list2 = query2.getResultList();
		for (Book s : list2) 
			System.out.println(s);
		

		System.out.println("c.	List all books with given price range. e.g. between Rs. 100 to 500");
		Query query3 = em.createQuery("select b from Book b where b.price between 100 and 500");
		List<Book> list3 = query3.getResultList();
		for (Book s : list3) 
			System.out.println(s);
		

		System.out.println("d. List the author name for given book id. ");
		Query query4 = em.createQuery("select b.authors from Book b where b.isbn=1");
		List<Author> list4 = query4.getResultList();
		for (Author s : list4) 
			System.out.println(s);
		
		
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();
	}
}
