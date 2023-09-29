package in.shital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shital.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer>{

}
