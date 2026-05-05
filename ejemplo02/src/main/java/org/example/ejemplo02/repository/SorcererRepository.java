package org.example.ejemplo02.repository;

import org.example.ejemplo02.domain.entity.Sorcerer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SorcererRepository extends JpaRepository<Sorcerer, UUID > {
}
