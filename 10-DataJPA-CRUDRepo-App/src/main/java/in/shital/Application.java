package in.shital;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shital.entity.Book;
import in.shital.repo.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		
	    BookRepository repo=ctxt.getBean(BookRepository.class);
	    System.out.println(repo.getClass().getName());
	    
//1)save method(insert & update)
		
		
		/*
		 * Book b=new Book(); b.setBookId(103); b.setBookName("Angular JS");
		 * b.setBookPrice(3000.00); repo.save(b); System.out.println("Record inserted");
		 */
		 
//2)saveAll method
		
			
		/*
		 * Book b1=new Book(); b1.setBookId(104); b1.setBookName("React JS");
		 * b1.setBookPrice(4000.00);
		 * 
		 * Book b2=new Book(); b2.setBookId(105); b2.setBookName("Vue JS");
		 * b2.setBookPrice(5000.00);
		 * 
		 * repo.saveAll(Arrays.asList(b1,b2));
		 */
			 
	    
//3)existsById method
		/*
		 * Boolean status=repo.existsById(103);
		 * System.out.println("Record exists: "+status);
		 */
	    
//4)count method
		/* System.out.println("Records count: "+repo.count()); */
	    
//5)findById method
		/*
		 * Optional<Book> findById=repo.findById(101);
		 * System.out.println(findById.get());
		 */
	    
//6)findAllbyId method
		/*
		 * Iterable<Book> findAllById=repo.findAllById(Arrays.asList(101,102)); for(Book
		 * b:findAllById) { System.out.println(b); }
		 */
	    
//7)findAll method
		/*
		 * Iterable<Book> findAll=repo.findAll(); for(Book b:findAll) {
		 * System.out.println(b); }
		 */
	    
//8)delete method
		/*
		 * if(repo.existsById(105)) { repo.deleteById(105); }else {
		 * System.out.println("Record not found"); }
		 */
//9)deleteAllById method
	     //repo.deleteAllById(Arrays.asList(101,102,103));
		  
//10)delete(E) method
	    
//11)deleteAll(Iterable entities)
	    
//12)deleteAll method
	    //repo.deleteAll();
	    
//*****************************calling findBy methods***************************************
	    
		/*
		 * Iterable<Book> findByBookPrice=repo.findByBookPriceGreaterThan(4500.00);
		 * for(Book b:findByBookPrice) { System.out.println(findByBookPrice); }
		 */
	    
		/*
		 * Iterable<Book> findByBookName=repo.findByBookName("Angular JS"); for(Book
		 * b:findByBookName) { System.out.println(findByBookName); }
		 */
	    
//*****************************Calling Native SQL and HQL queries****************************************	    
		/*
		 * List<Book> Books=repo.getAllBooks(); for(Book b:Books) {
		 * System.out.println(b); }
		 */
	    
		/*
		 * List<Book> books=repo.getBooks(); for(Book b:books) { System.out.println(b);
		 * }
		 */
	}

}
//interface variable repo will store the implmentation class object
//JPA will provide implementation for the interface BookRepository at runtime(proxy class)