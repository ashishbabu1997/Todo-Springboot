package com.example.firstSpringBootProject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
 public ResponseEntity<List<Todo>> getTodos(){
        return ResponseEntity.status(HttpStatus.OK).body(todos);
 }

 @PostMapping("/todos")
 public ResponseEntity<Todo >createTodo(@RequestBody Todo newTodo){
     todos.add(newTodo);
     return ResponseEntity.status(HttpStatus.CREATED).body(newTodo);

 }
}
