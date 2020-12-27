package com.demo.Bricouli.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.Bricouli.models.User;



@Repository
public interface UserRepository extends JpaRepository<User, Double> {

}