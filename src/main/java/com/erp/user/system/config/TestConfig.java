package com.erp.user.system.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.erp.user.system.model.User;
import com.erp.user.system.repository.UserRepository;
import com.erp.user.system.util.UserConstructor;

@Configuration
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    @Autowired
    public TestConfig(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        User u1 = UserConstructor.create(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = UserConstructor.create(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}