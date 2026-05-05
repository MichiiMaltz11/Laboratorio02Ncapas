package org.example.ejemplo02.domain.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "Hechiceros")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sorcerer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "Nombre")
    private String name;

    @Column(name = "Grado")
    private String grade;

    @Column(name = "Tecnica Maldita")
    private String cursedTech;

    @Column(name = "Escuela")
    private String school;

    @Column(name = "Energia Maldita")
    private Double cursedEnergy;

    @Column(name = "Activo")
    private boolean isActive;
}
