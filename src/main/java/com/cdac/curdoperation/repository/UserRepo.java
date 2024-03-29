package com.cdac.curdoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.curdoperation.entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, String>{

}
