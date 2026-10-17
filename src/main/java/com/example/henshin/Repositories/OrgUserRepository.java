package com.example.henshin.Repositories;

import com.example.henshin.Entities.OrgUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrgUserRepository extends JpaRepository<OrgUser, Long> {
}
