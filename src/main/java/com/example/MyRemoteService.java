package com.example;

import com.example.repository.MyRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.List;

// ✅ Service calls static Panache methods directly
@ApplicationScoped
public class MyRemoteService {
    public List<MyEntity> getAllEntities() { return MyEntity.listAll(); }
    public MyEntity getEntityById(Long id) { return MyEntity.findById(id); }
    @Transactional public void addEntity(MyEntity entity) { entity.persist(); }
    @Transactional public boolean deleteEntity(Long id) { return MyEntity.deleteById(id); }
}
