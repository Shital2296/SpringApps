package in.shital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
