package com.example.demo.controller;


import com.example.demo.Entity.Task;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/")
    public ResponseEntity main() {
          return ResponseEntity.ok(200);
    }
    @GetMapping("/task")
  public ResponseEntity task() {
        return ResponseEntity.ok(new Task(1L,"Restfull"));
  }
}
