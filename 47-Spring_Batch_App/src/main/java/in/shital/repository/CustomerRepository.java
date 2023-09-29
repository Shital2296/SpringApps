package in.shital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
