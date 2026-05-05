package org.example.ejemplo02.service;

import org.example.ejemplo02.domain.entity.Sorcerer;

import java.util.List;
import java.util.UUID;

public interface SorcererService {
    void createSorcerer(Sorcerer sorcerer);
    List<Sorcerer> getAllSorcerers();
    Sorcerer getSorcererById(UUID id);
    void updateSorcerer(UUID id, Sorcerer sorcerer);
    Sorcerer deleteSorcerer(UUID id);
}
