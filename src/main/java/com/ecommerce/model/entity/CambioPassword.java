package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "cambio_password")
public class CambioPassword {
    @Id
    @SequenceGenerator(name = "cambio_password_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cambio_password_id_seq")
    private Long id;
    private String token;
    /**
     * Indica si el token fue usado
     * true si es está usado, false si no.
     */
    private boolean estado;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}