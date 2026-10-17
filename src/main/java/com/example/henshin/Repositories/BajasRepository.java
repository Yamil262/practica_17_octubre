package com.example.henshin.Repositories;

import com.example.henshin.Entities.Bajas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajasRepository extends JpaRepository<Bajas, Long> {
}
