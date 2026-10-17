package com.example.henshin.Repositories;

import com.example.henshin.Entities.Resp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespRepository extends JpaRepository<Resp, Long> {
}
