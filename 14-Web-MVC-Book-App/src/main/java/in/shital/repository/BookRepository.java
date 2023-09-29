package in.shital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
