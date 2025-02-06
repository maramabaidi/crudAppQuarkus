package com.example;

import com.example.repository.MyRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class MyRemoteService {

    @Inject
    MyRepository repository;

    public List<MyEntity> getAllEntities() {
        return repository.listAll();
    }

    public MyEntity getEntityById(Long id) {
        return repository.findById(id);
    }

    @Transactional
    public void addEntity(MyEntity entity) {
        repository.persist(entity);
    }

    @Transactional
    public boolean deleteEntity(Long id) {
        return repository.deleteById(id);
    }
}
