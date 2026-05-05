package org.example.ejemplo02.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.ejemplo02.domain.entity.Sorcerer;
import org.example.ejemplo02.repository.SorcererRepository;
import org.example.ejemplo02.service.SorcererService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor

public class SorcererServiceImpl implements SorcererService {

    private final SorcererRepository sorcererRepository;

    @Override
    public void createSorcerer(Sorcerer sorcerer) {

    }
}
