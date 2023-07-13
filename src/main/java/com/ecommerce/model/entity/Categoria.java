package com.ecommerce.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "categoria")
public class Categoria {

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Id
    private long id;

    private String nombre;

}
