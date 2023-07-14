package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "usuario")
public class Usuario {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String email;

    private String contrasenia;

    @ManyToOne
    @JoinColumn(name = "rol_id", nullable = false)
    private Rol rol;

}
