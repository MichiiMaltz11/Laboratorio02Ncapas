package org.example.ejemplo02.controller;

import lombok.AllArgsConstructor;
import org.example.ejemplo02.domain.entity.Sorcerer;
import org.example.ejemplo02.service.SorcererService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sorcerer")
@AllArgsConstructor

public class SorcererController {
    private final SorcererService sorcererService;

    @PostMapping("/create")
    public ResponseEntity<Sorcerer> createSorcerer(@RequestBody Sorcerer sorcerer) {
        sorcererService.createSorcerer(sorcerer);

        return ResponseEntity.status(HttpStatus.CREATED).body(sorcerer);
    }
}
