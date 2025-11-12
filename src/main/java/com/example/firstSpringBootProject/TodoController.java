package com.example.firstSpringBootProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TodoController {
 private static List<Todo> todos;
 public TodoController()
 {
     todos=new ArrayList<>();
     todos.add(new Todo(1,false,"Task1",1));

 }

 @GetMapping("/todos")
 public List<Todo> getTodos(){
        return todos;
 }
}
