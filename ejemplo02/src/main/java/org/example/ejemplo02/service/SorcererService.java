package org.example.ejemplo02.service;

import org.example.ejemplo02.domain.entity.Sorcerer;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SorcererService {
    void createSorcerer(Sorcerer sorcerer);
    List<Sorcerer> getAllSorcerers();
    Sorcerer getSorcererById(UUID id);
}
