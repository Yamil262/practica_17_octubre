package com.example.henshin.Repositories;

import com.example.henshin.Entities.Trasfe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrasfeRepository extends JpaRepository<Trasfe, Long> {
}
