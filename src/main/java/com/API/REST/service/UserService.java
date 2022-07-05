package com.API.REST.service;

import com.API.REST.model.Users;
import com.API.REST.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private Repo repo;
    public String saveUser(Users user){
        repo.save(user);
        return "saved";
    }
    public Iterable<Users> findall(){
        return repo.findAll();
    }
    public Optional<Users> findid(int id){
       return repo.findById(id);
    }
}
