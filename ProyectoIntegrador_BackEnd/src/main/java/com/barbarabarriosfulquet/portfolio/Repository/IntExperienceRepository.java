package com.barbarabarriosfulquet.portfolio.Repository;

import com.barbarabarriosfulquet.portfolio.Entity.Experience;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntExperienceRepository extends JpaRepository<Experience, Integer>{
    public Optional<Experience> findByNameExp(String nameExp);
    public boolean existsByNameExp(String nameExp);
}