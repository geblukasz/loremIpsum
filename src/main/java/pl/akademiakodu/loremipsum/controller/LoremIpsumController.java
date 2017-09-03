package pl.akademiakodu.loremipsum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.akademiakodu.loremipsum.Model.Form;
import pl.akademiakodu.loremipsum.Model.Generator;

@Controller
public class LoremIpsumController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/")
    public String home(@ModelAttribute Form form, ModelMap modelMap)
    {
        Generator generator = new Generator();
        switch(form.getOption()){
            case 1:
                modelMap.addAttribute("lorem", generator.generateParagraphs(form.getNumber()));
                break;
            case 2:
                modelMap.addAttribute("lorem", generator.generateSentences(form.getNumber()));
                break;
            case 3:
                modelMap.addAttribute("lorem", generator.generateWords(form.getNumber()));
                break;
        }

        return "home";
    }
}
