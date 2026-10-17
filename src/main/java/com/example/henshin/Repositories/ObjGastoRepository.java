package com.example.henshin.Repositories;

import com.example.henshin.Entities.ObjGasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjGastoRepository extends JpaRepository<ObjGasto, Long> {
}
