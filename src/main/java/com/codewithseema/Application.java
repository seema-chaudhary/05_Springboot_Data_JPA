package com.codewithseema;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codewithseema.entities.Student;
import com.codewithseema.repository.StudentRepo;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepo stuRepo = context.getBean(StudentRepo.class);
		
//		Student st = new Student();
//		st.setName("Seema3");
//		st.setAddress("Delhi3");
		
//		stuRepo.save(st); // Create Data
		
//		List<Student> list = (List<Student>) stuRepo.findAll(); // Read data ***************************
//		list.forEach(student -> System.out.println(student) );
		
//		Student st1 = stuRepo.findById(2).get();// Read data by id *****************************
//		System.out.println(st1);
		
//		Student st1 = stuRepo.findById(2).get();//Updating data by id ***************************
//		System.out.println(st1);
//		
//		st1.setName("Seema Ch");
//		st1.setAddress("US-1");
//		
//		Student updatedstu = stuRepo.save(st1);
//		System.out.println(updatedstu);
		
		Student st1 = stuRepo.findById(2).get();// Deleting data by id ***************************
		System.out.println(st1);
			
		stuRepo.delete(st1);
		System.out.println("Record Deleted");
	}

}
