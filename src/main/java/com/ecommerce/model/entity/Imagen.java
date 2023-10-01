package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "imagen")
public class Imagen {
    @Id
    @SequenceGenerator(name = "imagen_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "imagen_id_seq")
    private Long id;
    private String nombre;
    private String url;
    private String tipoArchivo;
}
