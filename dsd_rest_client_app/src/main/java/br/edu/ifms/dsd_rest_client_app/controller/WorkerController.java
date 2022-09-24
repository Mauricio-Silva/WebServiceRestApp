package br.edu.ifms.dsd_rest_client_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifms.dsd_rest_client_app.service.WorkerService;

@RestController
@RequestMapping(value = "/worker")
public class WorkerController {
    
    @Autowired
    WorkerService workerService;

    @GetMapping(value = "/")
    public ResponseEntity<String> getWorker() {
        return ResponseEntity.ok(workerService.getGreetingDescription());
    }
}
