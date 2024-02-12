package com.jp.springboot.service;

import com.jp.springboot.model.Person;
import com.jp.springboot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository userRepository;

    public Person getById(long id) {
        Optional<Person> person = userRepository.findById(id);
        return person.get();
    }

    public Person save(Person person) {
        Person saved = userRepository.save(person);
        return saved;
    }
}
