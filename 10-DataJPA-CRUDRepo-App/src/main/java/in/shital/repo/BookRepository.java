package in.shital.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import in.shital.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

	//**********************findBy methods*******************************
	
	//select * from Book where book_price > price
	public List<Book> findByBookPriceGreaterThan(Double price);
	
	//select * from Book where book_price < price
	public List<Book> findByBookPriceLessThan(Double price);
	
	//select * from Book where book_name=bookName
	public List<Book> findByBookName(String bookName);
	
	//************************Native SQL query******************************
	
	@Query(value="select * from book",nativeQuery=true)
	public List<Book> getAllBooks();
	
	//****************************HQL queries***********************************
	
	@Query(value="from Book")
	public List<Book> getBooks();
	
	
}
