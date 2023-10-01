package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "producto")
public class Producto {
    @Id
    @SequenceGenerator(name = "producto_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "producto_id_seq")
    private Long id;
    private String nombre;
    private int stock;
    private String descripcion;
    @Column(name = "is_activo")
    private boolean isActivo;
    @Column(name = "precio_act")
    private double precioAct;
    @Column(name = "precio_desc")
    private double precioDesc;
    @Column(name = "fecha_inicio_desc")
    private Date fechaInicioDesc;
    @Column(name = "fecha_fin_desc")
    private Date fechaFinDesc;
    @Column(name = "ult_actualizacion")
    private Date ultActualizacion;
    @ManyToOne
    @JoinColumn(name = "imagen_id", referencedColumnName = "id")
    private Imagen imagen;
}
