package org.example.ejemplo02.controller;

import lombok.AllArgsConstructor;
import org.example.ejemplo02.domain.entity.Sorcerer;
import org.example.ejemplo02.service.SorcererService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/sorcerers")
@AllArgsConstructor

public class SorcererController {
    private final SorcererService sorcererService;

    @PostMapping("/")
    public ResponseEntity<Sorcerer> createSorcerer(@RequestBody Sorcerer sorcerer) {
        sorcererService.createSorcerer(sorcerer);

        return ResponseEntity.status(HttpStatus.CREATED).body(sorcerer);
    }

    @GetMapping("/")
    public ResponseEntity<List<Sorcerer>> getAllSorcerers() {
        List<Sorcerer> list = sorcererService.getAllSorcerers();
        return ResponseEntity.status(HttpStatus.OK).body(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sorcerer> getSorcererById(@PathVariable UUID id) {
        return ResponseEntity.
                status(HttpStatus.OK)
                .body(sorcererService.getSorcererById(id));
    }


}
