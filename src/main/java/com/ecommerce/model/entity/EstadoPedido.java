package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "estado_pedido")
public class EstadoPedido {
    @Id
    @SequenceGenerator(name = "estado_pedido_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_pedido_id_seq")
    private Long id;
    private String nombre;
}
