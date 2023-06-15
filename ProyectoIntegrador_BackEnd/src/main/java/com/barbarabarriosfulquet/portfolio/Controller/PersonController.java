package com.barbarabarriosfulquet.portfolio.Controller;

import com.barbarabarriosfulquet.portfolio.Entity.Person;
import com.barbarabarriosfulquet.portfolio.Interface.IntPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonController {
    @Autowired IntPersonService intpersonService;
    
    @GetMapping("persons/get")
    public List<Person> getPerson(){
        return intpersonService.getPerson();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/persons/create")
    public String createPerson(@RequestBody Person person){
        intpersonService.savePerson(person);
        return "El registro ha sido exitoso";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/persons/delete/{id}")
    public String deletePerson(@PathVariable Long id){
    intpersonService.deletePerson(id);
    return "La eliminación ha sido exitosa";
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/persons/edit/{id}")
    public Person editPerson(@PathVariable Long id,
            @RequestParam("name") String newName,
            @RequestParam("lastname") String newLastname,
            @RequestParam("img") String newImg){
        Person person = intpersonService.findPerson(id);
        person.setName(newName);
        person.setLastname(newLastname);
        person.setImg(newImg);
        intpersonService.savePerson(person);
        return person;
    }
    
    @GetMapping("/persons/get/profile")
    public Person findPerson(){
        return intpersonService.findPerson((long)15);
    }
}