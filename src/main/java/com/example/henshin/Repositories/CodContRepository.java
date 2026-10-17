package com.example.henshin.Repositories;

import com.example.henshin.Entities.CodCont;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodContRepository extends JpaRepository<CodCont, Long> {
}
