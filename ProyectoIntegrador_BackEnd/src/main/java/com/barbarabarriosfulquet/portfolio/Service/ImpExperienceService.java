package com.barbarabarriosfulquet.portfolio.Service;

import com.barbarabarriosfulquet.portfolio.Entity.Experience;
import com.barbarabarriosfulquet.portfolio.Repository.IntExperienceRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImpExperienceService {

    @Autowired
    IntExperienceRepository intExperienceRepository;

    public List<Experience> list() {
        return intExperienceRepository.findAll();
    }

    public Optional<Experience> getOne(int id) {
        return intExperienceRepository.findById(id);
    }

    public Optional<Experience> getByNameExperience(String nameExperience) {
        return intExperienceRepository.findByNameExperience(nameExperience);
    }

    public void save(Experience expe) {
        intExperienceRepository.save(expe);
    }

    public void delete(int id) {
        intExperienceRepository.deleteById(id);
    }

    public boolean existsById(int id) {
        return intExperienceRepository.existsById(id);
    }

    public boolean existsByNameExperience(String nameExperience) {
        return intExperienceRepository.existsByNameExperience(nameExperience);
    }
}