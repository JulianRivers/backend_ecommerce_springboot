package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "pedido")
public class Pedido {
    @Id
    @SequenceGenerator(name = "pedido_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_id_seq")
    private Long id;

    @Column(name = "direccion_entrega")
    private String direccionEntrega;
    @Column(name = "fecha_pedido")
    private Date fechaPedido;

    @Transient
    @Column(name = "fecha_pedido")
    private double totalCompra;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "metodo_pago_id", referencedColumnName = "id")
    private MetodoPago metodoPago;

    @ManyToOne
    @JoinColumn(name = "estado_pedido_id", referencedColumnName = "id")
    private EstadoPedido estadoPedido;

}
