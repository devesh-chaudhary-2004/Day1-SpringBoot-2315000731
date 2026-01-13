package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @GetMapping("/")
    public String hey(){
        return "this is the first sentence";
    }

    @GetMapping("/greetings")
    public String greetings() {
        return "Good afternoon. How are you?";
    }

    @GetMapping("/reply")
    public String reply() {
        return "I'm fine, thank you.";
    }

}
