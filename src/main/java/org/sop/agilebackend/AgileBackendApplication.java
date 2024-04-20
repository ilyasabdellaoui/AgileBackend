package org.sop.agilebackend;

import org.sop.agilebackend.models.Admin;
import org.sop.agilebackend.services.AdminService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AgileBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgileBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AdminService adminService) {
		return args -> {
			Admin admin = adminService.findByEmail("admin@gmail.com");
			if(admin == null){
				admin = new Admin("admin@gmail.com","123");
				adminService.save(admin);
			}
		};
	}

}
