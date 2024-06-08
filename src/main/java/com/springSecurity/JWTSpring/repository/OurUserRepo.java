package com.springSecurity.JWTSpring.repository;

import com.springSecurity.JWTSpring.entity.OurUsers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OurUserRepo extends JpaRepository<OurUsers, Integer> {

}
