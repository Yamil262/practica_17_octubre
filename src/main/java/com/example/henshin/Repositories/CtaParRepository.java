package com.example.henshin.Repositories;

import com.example.henshin.Entities.CtaPar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CtaParRepository extends JpaRepository<CtaPar, Long> {
}
