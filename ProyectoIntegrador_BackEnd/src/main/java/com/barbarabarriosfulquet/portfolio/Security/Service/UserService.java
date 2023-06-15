package com.barbarabarriosfulquet.portfolio.Security.Service;

import com.barbarabarriosfulquet.portfolio.Security.Entity.User;
import com.barbarabarriosfulquet.portfolio.Security.Repository.IntUserRepository;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    IntUserRepository intuserRepository;
    
    public Optional<User> getByUserName(String userName){
        return intuserRepository.findByUserName(userName);
    }
    
    public boolean existsByUserName(String userName){
        return intuserRepository.existsByUserName(userName);
    }
    
    public boolean existsByEmail(String email){
        return intuserRepository.existsByEmail(email);
    }
    
    public void save(User user){
        intuserRepository.save(user);
    }
}