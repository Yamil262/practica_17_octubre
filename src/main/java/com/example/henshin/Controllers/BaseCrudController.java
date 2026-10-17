package com.example.henshin.Controllers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/** CRUD genérico: create, getAll, getById, delete (mismo estilo que tus ProductController/CategoryController). */
public abstract class BaseCrudController<T, ID> {

    protected final JpaRepository<T, ID> repository;

    protected BaseCrudController(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    // Create (o actualiza si el JSON trae "id")
    @PostMapping
    public T create(@RequestBody T entity) {
        return repository.save(entity);
    }

    // Get all
    @GetMapping
    public List<T> getAll() {
        return repository.findAll();
    }

    // Get by ID
    @GetMapping("/{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // Delete
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable ID id) {
        if (!repository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        repository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
