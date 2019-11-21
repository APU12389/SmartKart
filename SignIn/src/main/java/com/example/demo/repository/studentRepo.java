package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Student;



@Repository
public interface studentRepo extends JpaRepository<Student,Integer> {
List<Student>findByName(String name);
List<Student>findByIdBetween(Integer start,Integer stop);
List<Student>findByAddressIgnoreCase(String password);
@Query("select u from User u where u.emailAddress =?1")
Student findByAddress(String password);

}
