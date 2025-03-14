package com.example.minhaapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ApiController {
    private List<String> tasks = new ArrayList<>();
    private final ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping(path = "/tasks")
    public ResponseEntity<String> getTasks() {
        try {
            tasks.add("MINHA TAREFA");
            return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Erro ao processar JSON");
        }
    }

    @PostMapping(path = "/tasks")
    public ResponseEntity<Void> createTasks(@RequestBody String Tarefa) {
        tasks.add(task);
        return ResponseEntity.ok().build();
    };

}
