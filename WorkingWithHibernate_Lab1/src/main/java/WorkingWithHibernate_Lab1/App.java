package WorkingWithHibernate_Lab1;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	public static void insertInDb() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the author's first name: ");
		String fname = sc.nextLine();
		System.out.print("Enter the author's middle name: ");
		String mname = sc.nextLine();
		System.out.print("Enter the author's lasst name: ");
		String lname = sc.nextLine();
		System.out.print("Enter the phone number: ");
		long phone = sc.nextLong();
		
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			Author author = new Author(fname,mname,lname,phone);
			
			session.save(author);
			transaction.commit();
			
			System.out.println("Data added successfully !!");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static void updateInDb() {
		
		Scanner sc = new Scanner(System.in);
		Author a1 = null;
		System.out.print("Enter the author id whose data is to be updated: ");
		int id = sc.nextInt();
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			if(session.get(Author.class, id) == null) {
				System.out.println("Invalid Id");
			}
			
			else{
				System.out.print("Enter new phone number: ");
				long ph = sc.nextLong();
				a1 = session.load(Author.class, id);
				a1.setPhoneNo(ph);
				session.update(a1);
				transaction.commit();
				System.out.println("Data updated !!");
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	
	public static void deleteInDb() {
		Scanner sc = new Scanner(System.in);
		Author a1 = null;
		System.out.print("Enter the author id whose data is to be deleted: ");
		int id = sc.nextInt();
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			if(session.get(Author.class, id) == null) {
				System.out.println("Invalid Id");
			}
			
			else{
				a1 = session.load(Author.class, id);
				session.delete(a1);
				transaction.commit();
				
				System.out.println("Data deleted !!");
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public static void printInfo() {
		Scanner sc = new Scanner(System.in);
		Author a1 = null;
		System.out.print("Enter the author id whose data is to be displayed: ");
		int id = sc.nextInt();
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			if(session.get(Author.class, id) == null) {
				System.out.println("Invalid Id");
			}
			
			else{
				a1 = session.load(Author.class, id);
				System.out.println(a1);
			}
			
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("CRUD Operation");
			System.out.println("1. Insert");
			System.out.println("2. Update");
			System.out.println("3. Delete");
			System.out.println("4. Display Information");
			System.out.print("Enter your choice or press -1 to exit: ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					insertInDb();
					break;
				case 2:
					updateInDb();
					break;
				case 3:
					deleteInDb();
					break;
				case 4:
					printInfo();
					break;
				case -1:
					System.exit(0);
			}
		}
	}
}