package com.example.serviceapi.transportlayer.http.openApiObjects;

public class UserResponse {
    private String id;
    private String name;

    public UserResponse(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public UserResponse() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
