package com.example.serviceapi.interactors;

import com.example.serviceapi.entities.UserEntity;
import com.example.serviceapi.repositories.UserRespository;
import org.springframework.stereotype.Service;

@Service
public class UserUseCase {
    private final UserRespository respository;

    public UserUseCase(UserRespository respository) {
        this.respository = respository;
    }

    public UserEntity createUser(UserEntity request) {
        return respository.persist(request);
    }


}
