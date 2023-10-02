package com.codewithseema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;

import com.codewithseema.entities.Student;

//public interface StudentRepo extends CrudRepository<Student, Integer>{
public interface StudentRepo extends JpaRepository<Student, Integer>{
// if we use JpaRepo we get CRUD + pagination, find all with sorting, ect,. and some extra functionality

}
