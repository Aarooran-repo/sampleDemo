package com.example.demo.sampleDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.sampleDemo.model.User;
import com.example.demo.sampleDemo.repository.IUserRepository;
@Component
public class AppStartupRunner implements ApplicationRunner {
    @Autowired
    IUserRepository userRepo;
    
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("I am here");
		User u1 = new User();
		u1.setEmail("aa4@gmail.com");
		u1.setFirstName("AAA");
		u1.setLastName("BB");
		u1.setUserStatus(0);
		userRepo.save(u1);
	
	}

}
