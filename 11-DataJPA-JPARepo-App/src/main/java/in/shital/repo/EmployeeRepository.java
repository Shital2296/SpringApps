package in.shital.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
