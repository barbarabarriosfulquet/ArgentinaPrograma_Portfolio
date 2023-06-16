package com.barbarabarriosfulquet.portfolio.Controller;

import com.barbarabarriosfulquet.portfolio.Dto.DtoExperience;
import com.barbarabarriosfulquet.portfolio.Entity.Experience;
import com.barbarabarriosfulquet.portfolio.Security.Controller.Message;
import com.barbarabarriosfulquet.portfolio.Service.ImpExperienceService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workexp")
@CrossOrigin(origins = "http://localhost:4200")
public class ExperienceController {

    @Autowired
    ImpExperienceService impExperienceService;

    @GetMapping("/list")
    public ResponseEntity<List<Experience>> list() {
        List<Experience> list = impExperienceService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Experience> getById(@PathVariable("id") int id) {
        if (!impExperienceService.existsById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        Experience experience = impExperienceService.getOne(id).get();
        return new ResponseEntity(experience, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!impExperienceService.existsById(id)) {
            return new ResponseEntity(new Message("no existe"), HttpStatus.NOT_FOUND);
        }
        impExperienceService.delete(id);
        return new ResponseEntity(new Message("producto eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoExperience dtoexp) {
        if (StringUtils.isBlank(dtoexp.getNameExp())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (impExperienceService.existsByNameExp(dtoexp.getNameExp())) {
            return new ResponseEntity(new Message("Experiencia existente"), HttpStatus.BAD_REQUEST);
        }

        Experience experience = new Experience(dtoexp.getNameExp(), dtoexp.getDescriptionExp());
        impExperienceService.save(experience);

        return new ResponseEntity(new Message("Experiencia agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoExperience dtoexp) {
        if (!impExperienceService.existsById(id)) {
            return new ResponseEntity(new Message("Id inexistente"), HttpStatus.BAD_REQUEST);
        }
        if (impExperienceService.existsByNameExp(dtoexp.getNameExp()) && impExperienceService.getByNameExp(dtoexp.getNameExp()).get().getId() != id) {
            return new ResponseEntity(new Message("Experiencia existente"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoexp.getNameExp())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Experience experience = impExperienceService.getOne(id).get();
        experience.setNameExp(dtoexp.getNameExp());
        experience.setDescriptionExp((dtoexp.getDescriptionExp()));

        impExperienceService.save(experience);
        return new ResponseEntity(new Message("Experiencia actualizada"), HttpStatus.OK);

    }
}
