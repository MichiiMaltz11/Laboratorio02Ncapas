package org.example.ejemplo02.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ejemplo02.domain.entity.Sorcerer;
import org.example.ejemplo02.repository.SorcererRepository;
import org.example.ejemplo02.service.SorcererService;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import static org.springframework.http.HttpStatus.NOT_FOUND;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor

public class SorcererServiceImpl implements SorcererService {

    private final SorcererRepository sorcererRepository;

    @Override
    public void createSorcerer(Sorcerer sorcerer) {
        sorcererRepository.save(sorcerer);
    }

    @Override
    public List<Sorcerer> getAllSorcerers() {
        return sorcererRepository.findAll();
    }

    @Override
    public Sorcerer getSorcererById(UUID id) {
        return sorcererRepository.getReferenceById(id);
    }

    @Override
    public void updateSorcerer(UUID id, Sorcerer sorcerer) {
        Sorcerer existing = sorcererRepository.getReferenceById(id);
        existing.setName(sorcerer.getName());
        existing.setGrade(sorcerer.getGrade());
        existing.setCursedTech(sorcerer.getCursedTech());
        existing.setSchool(sorcerer.getSchool());
        existing.setCursedEnergy(sorcerer.getCursedEnergy());
        existing.setActive(sorcerer.isActive());
        sorcererRepository.save(existing);
    }

    @Override
    public Sorcerer deleteSorcerer(UUID id) {
        Sorcerer existing = sorcererRepository.getReferenceById(id);
        sorcererRepository.deleteById(id);
        return existing;
    }
}
