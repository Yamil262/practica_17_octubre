package com.example.henshin.Repositories;

import com.example.henshin.Entities.OrganismoFin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganismoFinRepository extends JpaRepository<OrganismoFin, Long> {
}
