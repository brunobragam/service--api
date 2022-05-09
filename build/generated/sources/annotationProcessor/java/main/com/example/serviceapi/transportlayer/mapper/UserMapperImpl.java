package com.example.serviceapi.transportlayer.mapper;

import com.example.serviceapi.entities.UserEntity;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserRequest;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-09T10:25:28-0300",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 11.0.13 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity map(UserRequest request) {
        if ( request == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        if ( request.getId() != null ) {
            userEntity.setId( Long.parseLong( request.getId() ) );
        }
        userEntity.setName( request.getName() );
        userEntity.setAddress( request.getAddress() );

        return userEntity;
    }

    @Override
    public UserResponse map(UserEntity model) {
        if ( model == null ) {
            return null;
        }

        UserResponse userResponse = new UserResponse();

        if ( model.getId() != null ) {
            userResponse.setId( String.valueOf( model.getId() ) );
        }
        userResponse.setName( model.getName() );

        return userResponse;
    }
}
