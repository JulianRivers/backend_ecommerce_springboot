package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "metodo_pago")
public class MetodoPago {
    @Id
    @SequenceGenerator(name = "metodo_pago_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "metodo_pago_id_seq")
    private Long id;
    private String nombre;
}

