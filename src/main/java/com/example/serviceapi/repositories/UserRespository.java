package com.example.serviceapi.repositories;

import com.example.serviceapi.entities.UserEntity;

public interface UserRespository {


    UserEntity persist(UserEntity request);

}
