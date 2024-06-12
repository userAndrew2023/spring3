package com.example.demo.repository;

import com.example.demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {

    List<Person> findByAge(int age);
    List<Person> findByLastName(String lastName);
    List<Person> findByFirstName(String firstName);
}