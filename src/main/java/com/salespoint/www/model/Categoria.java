package com.salespoint.www.model;

import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idCategoria;

    @Column(length = 20, nullable = false, unique = true)
    private String nombreCategoria;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categoriaIdCategoria")
    private Collection<Producto> productoCollection;
}
