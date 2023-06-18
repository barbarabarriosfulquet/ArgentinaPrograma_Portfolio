package com.barbarabarriosfulquet.portfolio.Repository;

import com.barbarabarriosfulquet.portfolio.Entity.Education;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntEducationRepository extends JpaRepository<Education, Integer> {
    public Optional<Education> findByNameEducation(String nameEducation);
    public boolean existsByNameEducation(String nameEducation);
}