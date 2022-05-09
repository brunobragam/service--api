package com.example.serviceapi.transportlayer.mapper;

import com.example.serviceapi.entities.UserEntity;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserRequest;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserEntity map(UserRequest request);

    UserResponse map(UserEntity model);
}
