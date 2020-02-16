package com.example.demo.sampleDemo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.sampleDemo.model.User;
@Repository
public interface IUserRepository extends JpaRepository<User,Long> {
	
	public List<User> findAllByemail(String email);

}
