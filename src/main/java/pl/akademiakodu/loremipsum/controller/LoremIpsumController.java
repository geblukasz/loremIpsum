package pl.akademiakodu.loremipsum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String home(){
        return "home";
    }
}
