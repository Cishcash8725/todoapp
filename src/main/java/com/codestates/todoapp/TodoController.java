package com.codestates.todoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @GetMapping("/todo")
    public String TodoApp() {
        return "To-do Application !";
    }
}
