package com.example.serviceapi.transportlayer.http;

import com.example.serviceapi.entities.UserEntity;
import com.example.serviceapi.interactors.UserUseCase;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserRequest;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserResponse;
import com.example.serviceapi.transportlayer.mapper.UserMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class UserApiImplementation implements UserApi {

    private final UserMapper mapper;
    private final UserUseCase userUseCase;

    public UserApiImplementation(UserUseCase userUseCase) {
        this.userUseCase = userUseCase;
        this.mapper = UserMapper.INSTANCE;
    }


    @Override
    public ResponseEntity<UserResponse> createUser(UserRequest request) {
        UserEntity userEntity = mapper.map(request);
        var response =
                Optional.of(userUseCase.createUser(userEntity))
                        .map(mapper::map)
                        .orElseThrow();

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<UserResponse> getUser(Integer userIdRequest) {

        return null;
    }

    @Override
    public ResponseEntity<UserResponse> changeUser(UserRequest request) {
        return null;
    }
}
