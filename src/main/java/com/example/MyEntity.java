package com.example;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "my_entity")
public class MyEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Use auto-increment
    public Long id;

    public String name;
    public String description;
}
