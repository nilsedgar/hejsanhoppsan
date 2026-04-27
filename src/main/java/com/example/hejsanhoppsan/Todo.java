package com.example.hejsanhoppsan;

import jakarta.persistence.*;

@Entity
@Table(name="todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="completed")
    private boolean completed;

    @Column(name="todo_task", length=100)
    private String todoTask;

    public Todo(String todoTask) {
        this.completed = false;
        this.todoTask = todoTask;
    }

    public Todo() {

    }

    public String getTodoTask() {
        return todoTask;
    }

    public void setTodoTask(String todoTask) {
        this.todoTask = todoTask;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
