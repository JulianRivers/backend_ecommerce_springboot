package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "producto_x_subcategoria")
public class ProductoXSubcategoria {
    @Id
    @SequenceGenerator(name = "producto_x_subcategoria_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_x_subcategoria_id_seq")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id", referencedColumnName = "id", nullable = false)
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "subcategoria_id", referencedColumnName = "id", nullable = false)
    private Subcategoria subCategoria;

}