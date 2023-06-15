package com.barbarabarriosfulquet.portfolio.Security.Repository;

import com.barbarabarriosfulquet.portfolio.Security.Entity.Role;
import com.barbarabarriosfulquet.portfolio.Security.Enums.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntRoleRepository extends JpaRepository<Role, Integer>{
    Optional<Role> findByRoleName(RoleName roleName);
}
