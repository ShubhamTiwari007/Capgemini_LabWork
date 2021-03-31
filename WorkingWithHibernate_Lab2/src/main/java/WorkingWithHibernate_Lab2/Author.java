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
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	private String name;
	
	@ManyToMany
	private List<Book> books = new ArrayList<>();

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBook() {
		return books;
	}

	public void setBook(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", book=" + books + "]";
	}
	
}
