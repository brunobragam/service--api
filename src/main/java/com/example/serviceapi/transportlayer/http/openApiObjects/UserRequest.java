package com.example.serviceapi.transportlayer.http.openApiObjects;

public class UserRequest {

    private String id;
    private String name;
    private String Address;

    public UserRequest(String id, String name, String address) {
        this.id = id;
        this.name = name;
        Address = address;
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

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
