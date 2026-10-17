package com.example.henshin.Repositories;

import com.example.henshin.Entities.Entidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntidadesRepository extends JpaRepository<Entidades, Long> {
}
