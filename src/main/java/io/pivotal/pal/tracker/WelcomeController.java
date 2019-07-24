<<<<<<< HEAD
package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String welcomeMessage;

    public WelcomeController(
            @Value("${welcome.message}") String welcomeMessage
    ) {
        this.welcomeMessage = welcomeMessage;
    }

    @GetMapping("/")
    public String sayHello() {
        return welcomeMessage;
    }
}
=======
package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    private String message;

    public WelcomeController(@Value("${welcome.message:Not set}") String message) {
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello() {
        return this.message;
    }
}
>>>>>>> 67d0fd1815d31741823ca1f315763021de97171b
