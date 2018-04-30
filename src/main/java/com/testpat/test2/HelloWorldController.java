package com.testpat.test2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(value = "name") String name) {

        return "Hello "+ name +"!";
    }

   /* @GetMapping("/")
    public String home() {
        return "home";
    }*/

    @GetMapping("/")
    public String home(final ModelMap pModel) {

        pModel.addAttribute("message", "toto");
        return "home";
    }

}
