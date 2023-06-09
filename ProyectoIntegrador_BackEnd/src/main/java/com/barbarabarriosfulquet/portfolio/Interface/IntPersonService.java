package com.barbarabarriosfulquet.portfolio.Interface;

import com.barbarabarriosfulquet.portfolio.Entity.Person;
import java.util.List;

public interface IntPersonService {
    //Person List
    public List<Person> getPerson();
    // Save object person
    public void savePerson (Person person);
    // Delete object person
    public void deletePerson(Long id);
    //Search id person
    public Person findPerson(Long id);
}
