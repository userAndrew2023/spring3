package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public List<Person> getByFirstName(String firstName) {
        return personRepository.findByFirstName(firstName);
    }

    public List<Person> getByLastName(String lastName) {
        return personRepository.findByLastName(lastName);
    }

    public List<Person> getByAge(int age) {
        return personRepository.findByAge(age);
    }

    public Person getById(Long id) {
        return personRepository.findById(id).orElse(null);
    }

    public Person save(Person person) {
        return personRepository.save(person);
    }

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }
}
