package com.example.serviceapi.datasource.relational.mapper;

import com.example.serviceapi.datasource.relational.model.UserModelJPA;
import com.example.serviceapi.entities.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserDataMapper {
    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);

    UserModelJPA map(UserEntity entity);
    UserEntity map(UserModelJPA userModelJPA);
}
