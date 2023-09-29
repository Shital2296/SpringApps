package in.shital;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.shital.entity.Employee;
import in.shital.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(Application.class, args);
		
		EmployeeRepository repository=ctxt.getBean(EmployeeRepository.class);
		//System.out.println(repo.getClass().getName());
		
		//********************Insert records by using param-constructor******************************
		//Employee e1=new Employee(101, "Shital",50000.00 , "Female", "Java");
		//Employee e2=new Employee(102, "Pratik",15000.00 , "Male", "Network");
		//Employee e3=new Employee(103, "Komal",20000.00 , "Female", "SQL");
		//Employee e4=new Employee(104, "Sanchit",10000.00 , "Male", "ServiceNow");
		//Employee e5=new Employee(105, "Arti",30000.00 , "Female", "HR");
		//Employee e6=new Employee(106, "Neha",40000.00 , "Female", "Automobile");
		//Employee e7=new Employee(107, "Ashwin",20000.00 , "Male", "Python");
		
		//repo.saveAll(Arrays.asList(e8));
		//System.out.println("Record saved..........");
		
		//******************************To get list of all records*****************************
		//List<Employee> emps=repository.findAll();
		//emps.forEach(System.out::println);
		
		
		//****************************Sorting*******************
		//Sort sort=Sort.by("empName").ascending();
		//List<Employee> emps1=repository.findAll(sort);
		//emps1.forEach(System.out::println);
		
		//***********************************Pagination*************************8
		//int pageNo=1;
		//PageRequest page=PageRequest.of(pageNo-1, 3);
		//Page<Employee> findAll=repository.findAll(page);
		//List<Employee> emps2=findAll.getContent();
		//emps2.forEach(System.out::println);
		
		
		//***********************************QBE***********************************
		//Employee e=new Employee();
		//e.setEmpGender("Female");
		//e.setDept("HR");
		
		//Example<Employee> example=Example.of(e);
		//List<Employee> emps3=repository.findAll(example);
		//emps3.forEach(System.out::println);
		
		
		//*****************************testing timestamping and generator********************
		
		Employee emp=new Employee();
		
		emp.setEmpName("bdfhgsj");
		emp.setEmpSalary(10000.00);
		emp.setDept("network");
		emp.setEmpGender("male");
		
		emp=repository.save(emp);
		
		System.out.println("record inserted");
	}

}

//you can sort based on multiple columns============Sort.by("empName:,"empSalary")
//Pagination method========================PageRequest.of(pageNo,pageSize)

//when you pass page object as a parameter, it will also return page object
//from that page object, you will need to get content by using getContent() method

//Assignment
//update,delete,insert by using custom query
