package com.example.henshin.Repositories;

import com.example.henshin.Entities.EstEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstEntRepository extends JpaRepository<EstEnt, Long> {
}
