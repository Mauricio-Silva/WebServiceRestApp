package br.edu.ifms.dsd_rest_template_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.dsd_rest_template_app.model.Greeting;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping(value = "/")
    public ResponseEntity<Greeting> getMethodName() {
        return ResponseEntity.ok(new Greeting("Hello, World!"));
    }
       
}
