package com.example.hejsanhoppsan;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    public void addTodo(TodoDTO todoDto) {
        Todo todo = new Todo(todoDto.getTitle());
        todoRepository.save(todo);
    }
}
