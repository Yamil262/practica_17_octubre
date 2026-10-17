package com.example.henshin.Repositories;

import com.example.henshin.Entities.Backups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BackupsRepository extends JpaRepository<Backups, Long> {
}
