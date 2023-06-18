package com.barbarabarriosfulquet.portfolio.Service;

import com.barbarabarriosfulquet.portfolio.Entity.Education;
import com.barbarabarriosfulquet.portfolio.Repository.IntEducationRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpEducationService {

    @Autowired
    IntEducationRepository intEducationRepository;

    public List<Education> list() {
        return intEducationRepository.findAll();
    }

    public Optional<Education> getOne(int id) {
        return intEducationRepository.findById(id);
    }

    public Optional<Education> getByNameEducation(String nameEducation) {
        return intEducationRepository.findByNameEducation(nameEducation);
    }

    public void save(Education expe) {
        intEducationRepository.save(expe);
    }

    public void delete(int id) {
        intEducationRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return intEducationRepository.existsById(id);
    }

    public boolean existsByNameEducation(String nameEducation) {
        return intEducationRepository.existsByNameEducation(nameEducation);
    }
}