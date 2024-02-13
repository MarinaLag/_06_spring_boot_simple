package by.itclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MyFirstSpringBootApplication {

    @GetMapping(value = "/")
    String home() {
        return "Hello word";  // или возвращает страничку
    }

    // точка входа через метод main!!!!!!!!!!!!!!!!!!!!!!!!
    public static void main(String[] args) {
        // run - запускает
        SpringApplication.run(MyFirstSpringBootApplication.class, args);
    }
}
