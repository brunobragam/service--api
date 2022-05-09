package com.example.serviceapi.datasource.relational;

import com.example.serviceapi.datasource.relational.mapper.UserDataMapper;
import com.example.serviceapi.datasource.relational.model.UserModelJPA;
import com.example.serviceapi.datasource.relational.repository.UserJPARepository;
import com.example.serviceapi.entities.UserEntity;
import com.example.serviceapi.repositories.UserRespository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRespository {

    private final UserJPARepository userJPARepository;
    private final UserDataMapper mapper = UserDataMapper.INSTANCE;

    public UserRepositoryImpl(UserJPARepository userJPARepository) {
        this.userJPARepository = userJPARepository;
    }


    @Override
    public UserEntity persist(UserEntity request) {

        UserModelJPA map = mapper.map(request);
        return Optional.of(userJPARepository.save(map)).map(mapper::map).orElseThrow();
    }
}
