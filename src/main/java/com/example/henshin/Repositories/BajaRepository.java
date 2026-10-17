package com.example.henshin.Repositories;

import com.example.henshin.Entities.Baja;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BajaRepository extends JpaRepository<Baja, Long> {
}
