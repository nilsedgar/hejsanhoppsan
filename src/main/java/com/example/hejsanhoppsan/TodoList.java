package com.example.hejsanhoppsan;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class TodoList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    private List<Todo> todos;

}
