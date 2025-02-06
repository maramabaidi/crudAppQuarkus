package com.example.repository;

import com.example.MyEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MyRepository implements PanacheRepository<MyEntity> {
    // Panache provides built-in CRUD methods like listAll(), findById(), deleteById()
}
