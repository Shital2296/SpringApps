package in.shital.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.shital.entity.Student;
import in.shital.entity.StudentEntity;
import in.shital.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repo;
	
	public boolean saveStudent(Student student) {
		System.out.println(student);
		StudentEntity entity=new StudentEntity();
		
		//copying the data from binding object to entity object
		BeanUtils.copyProperties(student, entity);
		
		//in binding class and entity class,the datatype of timings is different. 
		//So we are manually setting the value for timings by converting array to string
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		System.out.println(entity);
		
		//saving entity obj
		repo.save(entity);
		return true;
	}
	
	
	
	public List<String> getCourses() {
		return Arrays.asList("Java","Python","AWS","DevOps");
	}
	public List<String> getTimings() {
		return Arrays.asList("Morning","Afternoon","Evening");
	}
}
