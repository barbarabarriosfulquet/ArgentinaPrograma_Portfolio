package com.barbarabarriosfulquet.portfolio.Security.Service;

import com.barbarabarriosfulquet.portfolio.Security.Entity.Role;
import com.barbarabarriosfulquet.portfolio.Security.Enums.RoleName;
import com.barbarabarriosfulquet.portfolio.Security.Repository.IntRoleRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RoleService {

    @Autowired
    IntRoleRepository introleRepository;

    public Optional<Role> getByRoleName(RoleName roleName) {
        return introleRepository.findByRoleName(RoleName.ROLE_ADMIN);
    }

    public void save(Role role) {
        introleRepository.save(role);
    }
}