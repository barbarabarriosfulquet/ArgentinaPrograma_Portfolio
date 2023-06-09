package com.barbarabarriosfulquet.portfolio.Repository;

import com.barbarabarriosfulquet.portfolio.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntPersonRepository extends JpaRepository<Person,Long>{
}
