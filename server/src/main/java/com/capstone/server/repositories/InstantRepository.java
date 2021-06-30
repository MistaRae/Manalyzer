package com.capstone.server.repositories;

import com.capstone.server.models.Instant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstantRepository extends JpaRepository<Instant, Long> {
}
