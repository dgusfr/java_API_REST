package com.example.minhaapi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    private final List<String> tasks = new ArrayList<>();
    private final ObjectMapper objectMapper;

    public ApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @GetMapping("/tasks")
    public ResponseEntity<String> getTasks() {
        try {
            return ResponseEntity.ok(objectMapper.writeValueAsString(tasks));
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body("Erro ao processar JSON");
        }
    }

    @PostMapping("/tasks")
    public ResponseEntity<Void> createTask(@RequestBody String task) {
        if (task == null || task.trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        tasks.add(task);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/tasks")
    public ResponseEntity<Void> clearTasks() {
        tasks.clear();
        return ResponseEntity.ok().build();
    }
}
