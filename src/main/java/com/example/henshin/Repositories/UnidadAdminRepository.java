package com.example.henshin.Repositories;

import com.example.henshin.Entities.UnidadAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadAdminRepository extends JpaRepository<UnidadAdmin, Long> {
}
