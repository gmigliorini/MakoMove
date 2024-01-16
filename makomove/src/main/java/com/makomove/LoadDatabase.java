package com.makomove;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.makomove.domain.User;
import com.makomove.repository.UserRepository;

@Configuration
public class LoadDatabase {

	private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	CommandLineRunner initDatabase(UserRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(new User("Garrett", "Migliorini", "login", "password")));
			log.info("Preloading " + repository.save(new User("Jeanette", "Maldonado", "login", "password")));
			log.info("Preloading " + repository.save(new User("Test", "Test", "login", "password")));
		};
	}
}
