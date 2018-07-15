package me.pzoupis.restservice.RestApp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class HelloWorld {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "/car/{id}",
            method = GET)
    @ResponseBody
    public String test(@PathVariable("id") long id) {
        return "Car with id: " + id;
    }
}
