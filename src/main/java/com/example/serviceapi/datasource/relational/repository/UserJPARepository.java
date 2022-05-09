package com.example.serviceapi.datasource.relational.repository;

import com.example.serviceapi.datasource.relational.model.UserModelJPA;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<UserModelJPA,Long> {
}
