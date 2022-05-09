package com.example.serviceapi.transportlayer.http;

import com.example.serviceapi.transportlayer.http.openApiObjects.UserRequest;
import com.example.serviceapi.transportlayer.http.openApiObjects.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserApi {

    @PostMapping("/create")
    ResponseEntity<UserResponse> createUser(UserRequest request);
    ResponseEntity<UserResponse> getUser(Integer userIdRequest);
    ResponseEntity<UserResponse> changeUser(UserRequest request);
}
