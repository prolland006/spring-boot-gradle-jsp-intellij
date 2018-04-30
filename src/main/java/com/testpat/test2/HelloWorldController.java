package com.testpat.test2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String sayHello(@RequestParam(value = "name") String name) {

        return "Hello "+ name +"!";
    }

    @RequestMapping("/ajax")
    public ModelAndView ajax() {
        return new ModelAndView("ajax");
    }

    @RequestMapping(value = "/ajaxquery", method = RequestMethod.GET)
    public @ResponseBody String getGreeting(@RequestParam String name) {
        String result = "Hello! " + name + ". Time for now is " + new Date().toString();
        bobo mybobo = new bobo("time",result);

        ObjectMapper mapper =new ObjectMapper();
        String jsonInString = null;
        try {
            jsonInString = mapper.writeValueAsString(mybobo);
        } catch (JsonProcessingException exc) {
            exc.printStackTrace();
        }

        return jsonInString;
    }

    @GetMapping("/")
    public String home(final ModelMap pModel) {

        pModel.addAttribute("message", "toto");
        return "home";
    }

}
