package com.example.serviceapi.datasource.relational.mapper;

import com.example.serviceapi.datasource.relational.model.UserModelJPA;
import com.example.serviceapi.entities.UserEntity;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-09T10:37:33-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class UserDataMapperImpl implements UserDataMapper {

    @Override
    public UserModelJPA map(UserEntity entity) {
        if ( entity == null ) {
            return null;
        }

        UserModelJPA userModelJPA = new UserModelJPA();

        userModelJPA.setId( entity.getId() );
        userModelJPA.setName( entity.getName() );
        userModelJPA.setAddress( entity.getAddress() );

        return userModelJPA;
    }

    @Override
    public UserEntity map(UserModelJPA userModelJPA) {
        if ( userModelJPA == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setId( userModelJPA.getId() );
        userEntity.setName( userModelJPA.getName() );
        userEntity.setAddress( userModelJPA.getAddress() );

        return userEntity;
    }
}
