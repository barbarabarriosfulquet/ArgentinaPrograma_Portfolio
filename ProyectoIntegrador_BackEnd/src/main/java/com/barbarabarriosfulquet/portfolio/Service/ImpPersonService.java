package com.barbarabarriosfulquet.portfolio.Service;

import com.barbarabarriosfulquet.portfolio.Entity.Person;
import com.barbarabarriosfulquet.portfolio.Interface.IntPersonService;
import com.barbarabarriosfulquet.portfolio.Repository.IntPersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPersonService implements IntPersonService{
    @Autowired IntPersonRepository intpersonRepository;

    @Override
    public List<Person> getPerson() {
        List<Person> person = intpersonRepository.findAll();
        return person;
    }

    @Override
    public void savePerson(Person person) {
        intpersonRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        intpersonRepository.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
        Person person = intpersonRepository.findById(id).orElse(null);
        return person;
    }
}