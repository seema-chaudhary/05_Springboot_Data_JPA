package com.codewithseema;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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
//		
//		Student st1 = stuRepo.findById(2).get();// Deleting data by id ***************************
//		System.out.println(st1);
//			
//		stuRepo.delete(st1);
//		System.out.println("Record Deleted");
		
//		Student st2 = stuRepo.findByName("seema");// calling custom method ******************************
//		System.out.println(st2);
		
//		Student st2 = stuRepo.findByNameAndAddress("seema", "Delhi");
//		System.out.println(st2);
		
//		List<Student> st2 = (List<Student>) stuRepo.findByNameOrAddress("seema", "delhi");
//		st2.forEach(s->System.out.println(s));
		
//		List<Student> st2 = (List<Student>) stuRepo.findByAddressIsNull();
//		List<Student> st2 = (List<Student>) stuRepo.findByAddressIsNotNull();
//		st2.forEach(s->System.out.println(s));
		
//		List<Student> st2 = stuRepo.findByNameLike("Seema");
//		st2.forEach(s->System.out.println(s));
		
//		List<Student> st2 = stuRepo.findByNameStartingWith("S");
//		st2.forEach(s->System.out.println(s));
		
//		List<Student> st2 = stuRepo.findByNameContaining("r");
//		st2.forEach(s->System.out.println(s));

		
		
//		 List<Student> st = stuRepo.findByOrderByNameDesc(); 
//		 st.forEach(e ->System.out.println(e));
		
//		 Boolean f = stuRepo.existsByName("Demo");
//		 System.out.println(f);
		
//
//		// custom query using
//		
//		 Student st = stuRepo.getStudentByNameAndAddress("Abhi", "delhi");
//		 System.out.println(st);
//		
//		  List<Student> st = stuRepo.searchName("ravi"); 
//		  st.forEach(e -> System.out.println(e));
		 

		// pagination**************************************************
		
//		Pageable pageable = PageRequest.of(1, 3);
//		Page<Student> page = stuRepo.findAll(pageable);
//		page.get().forEach(e -> System.out.println(e));		
//		System.out.println("Size=" + page.getSize());
//		System.out.println("Elements=" + page.getTotalElements());
//		System.out.println("Pages=" + page.getTotalPages());
		
//		Sorting and Pagination *****************************************
		
//		Sort sort = Sort.by("id").descending();
//		Sort sort = Sort.by("id").ascending();
//		Pageable pageable = PageRequest.of(0, 3, sort);		// page number and number of element
//		Page<Student> page = stuRepo.findAll(pageable);
//		page.get().forEach(e -> System.out.println(e));		
//		System.out.println("Size=" + page.getSize());
//		System.out.println("Elements=" + page.getTotalElements());
//		System.out.println("Pages=" + page.getTotalPages());
		
//		Sorting , Displaying page wise and Pagination *****************************************		
//		Sort sort = Sort.by("id").ascending();
		Sort sort = Sort.by("name").ascending();
		List<Student> listSortStudent = stuRepo.findAll(sort);
		System.out.println("-----------sorting student details--------");
		listSortStudent.forEach(e->System.out.println(e));
		System.out.println("------------------------");
		
		Pageable pageable = PageRequest.of(0, 3, sort);		// page number and number of element
		Page<Student> page = stuRepo.findAll(pageable);
		page.get().forEach(e -> System.out.println(e));		
		System.out.println("Size=" + page.getSize());
		System.out.println("Elements=" + page.getTotalElements());
		System.out.println("Pages=" + page.getTotalPages());
		
	}

}
