package in.shital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
