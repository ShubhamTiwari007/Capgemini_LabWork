package WorkingWithHibernate_Lab2;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int isbn;
	private String title;
	private double price;
	
	@ManyToMany(mappedBy = "books")
	private List<Author> authors = new ArrayList<>();
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int isbn, String title, double price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public List<Author> getAuthor() {
		return authors;
	}

	public void setAuthor(List<Author> authors) {
		this.authors = authors;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price +/* ", author=" + authors + */"]";
	}
	
	
}
