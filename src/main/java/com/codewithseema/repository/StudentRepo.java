package com.codewithseema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.codewithseema.entities.Student;

//public interface StudentRepo extends CrudRepository<Student, Integer>{
public interface StudentRepo extends JpaRepository<Student, Integer>{
// if we use JpaRepo we get CRUD + pagination, findall with sorting and findBy for custome query, ect,. and some extra functionality
// googleb -> data jpa documentation (5. query methods) for reference  https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference
	
	//custom query 
	Student findByName(String name);	
	Student findByNameAndAddress(String nm, String ad);
	
	List<Student> findByNameOrAddress(String nm, String ad);
	List<Student> findByAddressIsNull(); // NOT WORKING
	List<Student> findByAddressIsNotNull(); // NOT WORKING
	List<Student> findByNameLike(String name);
	List<Student> findByNameStartingWith(String ch);
	List<Student> findByNameContaining(String ch);
	List<Student> findByOrderByNameDesc();
	
	boolean existsByName(String name);
	
	@Query("select u from Student u where u.name=?1 and u.address=?2")
	Student getStudentByNameAndAddress(String name, String address);	
	
	@Query("select u from Student u where u.name like :nm")
	List<Student> getByNameOrAddress(@Param(value = "nm") String nm);
	
	@Query("select u from Student u where u.name =:nm or u.address =:ad")
	List<Student> searchName(@Param(value = "nm") String nm, @Param(value = "ad") String ad);
}
