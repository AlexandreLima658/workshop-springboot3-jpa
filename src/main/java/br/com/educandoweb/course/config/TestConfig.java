package br.com.educandoweb.course.config;

import br.com.educandoweb.course.entities.User;
import br.com.educandoweb.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User newUser1 = new User(null, "Alexandre", "alexandre@gmail.com","123455", "oflvkd");
        User newUser2 = new User(null, "Regina", "regina@gmail.com","12355", "reoflvkd");
        final var list = Arrays.asList(newUser1, newUser2);
        userRepository.saveAll(list);

    }
}
