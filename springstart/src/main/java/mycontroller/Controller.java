package mycontroller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("test")
    public String home(){
        return "Welcomr To Test";
    }
}
