package com.example.henshin.Repositories;

import com.example.henshin.Entities.Reval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RevalRepository extends JpaRepository<Reval, Long> {
}
