package com.example.henshin.Repositories;

import com.example.henshin.Entities.ClaDepts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaDeptsRepository extends JpaRepository<ClaDepts, Long> {
}
