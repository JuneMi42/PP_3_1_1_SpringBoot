package webApp.PP_3_1_1_SpringBoot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String printWelcomePage(ModelMap modelMap) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("I'm CRUD-Spring MVC application");
        messages.add("5.3.22 version by aug'22 ");
        modelMap.addAttribute("messages", messages);
    return "helloPages/helloPage";
    }
}
