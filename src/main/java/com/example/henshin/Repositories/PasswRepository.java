package com.example.henshin.Repositories;

import com.example.henshin.Entities.Passw;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswRepository extends JpaRepository<Passw, Long> {
}
