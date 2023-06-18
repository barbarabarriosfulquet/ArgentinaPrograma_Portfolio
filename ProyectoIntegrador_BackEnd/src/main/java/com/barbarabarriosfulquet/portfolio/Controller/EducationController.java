package com.barbarabarriosfulquet.portfolio.Controller;

import com.barbarabarriosfulquet.portfolio.Dto.DtoEducation;
import com.barbarabarriosfulquet.portfolio.Entity.Education;
import com.barbarabarriosfulquet.portfolio.Security.Controller.Message;
import com.barbarabarriosfulquet.portfolio.Service.ImpEducationService;
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
@RequestMapping("/education")
@CrossOrigin(origins = "http://localhost:4200")
public class EducationController {

    @Autowired
    ImpEducationService impEducationService;

    @GetMapping("/list")
    public ResponseEntity<List<Education>> list() {
        List<Education> list = impEducationService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Education> getById(@PathVariable("id") int id) {
        if (!impEducationService.existsById(id)) {
            return new ResponseEntity(new Message("Id inexistente"), HttpStatus.NOT_FOUND);
        }
        Education education = impEducationService.getOne(id).get();
        return new ResponseEntity(education, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if (!impEducationService.existsById(id)) {
            return new ResponseEntity(new Message("Id inexistente"), HttpStatus.NOT_FOUND);
        }
        impEducationService.delete(id);
        return new ResponseEntity(new Message("Id eliminado"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoEducation dtoeducation) {
        if (StringUtils.isBlank(dtoeducation.getNameEducation())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (impEducationService.existsByNameEducation(dtoeducation.getNameEducation())) {
            return new ResponseEntity(new Message("Educación existente"), HttpStatus.BAD_REQUEST);
        }

        Education education = new Education(dtoeducation.getNameEducation(), dtoeducation.getTitleEducation(), dtoeducation.getYearEducation(), dtoeducation.getCountryEducation(), dtoeducation.getDescriptionEducation());
        impEducationService.save(education);

        return new ResponseEntity(new Message("Educación agregada"), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id, @RequestBody DtoEducation dtoeducation) {
        if (!impEducationService.existsById(id)) {
            return new ResponseEntity(new Message("Id inexistente"), HttpStatus.BAD_REQUEST);
        }
        if (impEducationService.existsByNameEducation(dtoeducation.getNameEducation()) && impEducationService.getByNameEducation(dtoeducation.getNameEducation()).get().getId() != id) {
            return new ResponseEntity(new Message("Educación existente"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoeducation.getNameEducation())) {
            return new ResponseEntity(new Message("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        Education education = impEducationService.getOne(id).get();
        education.setNameEducation(dtoeducation.getNameEducation());
        education.setDescriptionEducation((dtoeducation.getDescriptionEducation()));

        impEducationService.save(education);
        return new ResponseEntity(new Message("Educación actualizada"), HttpStatus.OK);

    }
}
