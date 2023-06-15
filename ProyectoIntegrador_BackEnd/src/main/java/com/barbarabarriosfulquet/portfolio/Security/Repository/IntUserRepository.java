package com.barbarabarriosfulquet.portfolio.Security.Repository;

import com.barbarabarriosfulquet.portfolio.Security.Entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntUserRepository extends JpaRepository<User, Integer>{
    Optional<User> findByUserName(String userName);
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);
}
