package com.example.unittest.service;

import java.util.ArrayList;
import java.util.List;

public class TodoServiceImpl {
    private ToDoService todoService;
    // Constructor
    public TodoServiceImpl(ToDoService todoService) {
// This keyword refers to same instance itself
        this.todoService = todoService;
    }
    // Method
// Filtering the string
    public List<String>  retrieveTodosRelatedToJava(String user)
    {
        List<String> filteredTodos = new ArrayList<>();
        List<String> todos = todoService.retrieveToDos(user);
        for (String todo : todos) {
// Filtering the string that contains "Java"
// keyword
            if (todo.contains("Java")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}
