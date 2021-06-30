package com.capstone.server.repositories;

import com.capstone.server.models.Artefact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtefactRepository extends JpaRepository<Artefact, Long> {
}
