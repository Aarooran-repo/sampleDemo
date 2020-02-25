package com.example.demo.sampleDemo;

import java.util.ArrayList;
import java.util.List;

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
		
//		List<User > lStore = new ArrayList<User>();
//		
//		User u1 = new User();
//		u1.setEmail("ccc@gmail.com");
//		u1.setFirstName("CCCC");
//		u1.setLastName("DD");
//		u1.setUserStatus(0);
//		lStore.add(u1);
//		//userRepo.save(u1);
//		
//		User u2 = new User();
//		u2.setEmail("bbb@gmail.com");
//		u2.setFirstName("BBB");
//		u2.setLastName("CCC");
//		u2.setUserStatus(0);
//		lStore.add(u2);
//		
//		userRepo.saveAll(lStore);
//		
		
	

		 userRepo.deleteAll(); //

//		for(User u:lUser) {
//			System.out.println(u.getFirstName());
//		}
		
//		if (!lUser.isEmpty()) {
//			System.out.println("Found FirstName based on searching email Id : " + lUser.get(0).getFirstName());
//		}

	}

}
