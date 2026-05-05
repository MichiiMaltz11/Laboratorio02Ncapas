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
import java.util.stream.Collectors;

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
    public List<Sorcerer> getSorcerersBySchool(String school) {
        return sorcererRepository.findAll()
                .stream()
                .filter(sorcerer -> sorcerer.getSchool().equalsIgnoreCase(school))
                .collect(Collectors.toList());
    }

    @Override
    public List<Sorcerer> getSorcerersByGrade(String grade) {
        return sorcererRepository.findAll()
                .stream()
                .filter(sorcerer -> sorcerer.getGrade().equalsIgnoreCase(grade))
                .collect(Collectors.toList());
    }

    @Override
    public List<Sorcerer> getActiveSorcerers() {
        return sorcererRepository.findAll()
                .stream()
                .filter(Sorcerer::isActive)
                .collect(Collectors.toList());
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
