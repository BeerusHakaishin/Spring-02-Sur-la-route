package com.doctors.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

import com.doctors.demo.model.Doctor;


@Controller
@SpringBootApplication
public class RouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RouteApplication.class, args);
	}
	
	@RequestMapping("/doctor/{id}")
	@ResponseBody
    public Doctor doctor(@PathVariable int id) {
	       
     // El Famoso JSON for you 
    	if (id == 13) {
    		return new Doctor(13, "Jodie Whittaker");
	}
        if (id >= 1 && id <= 12) {
            throw new ResponseStatusException(HttpStatus.SEE_OTHER, "Test avec un autre id");
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Impossible de récupérer l'incarnation" + id);
        }
    }
}
