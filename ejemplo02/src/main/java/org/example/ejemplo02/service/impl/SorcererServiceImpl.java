package org.example.ejemplo02.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ejemplo02.domain.entity.Sorcerer;
import org.example.ejemplo02.repository.SorcererRepository;
import org.example.ejemplo02.service.SorcererService;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
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
}
