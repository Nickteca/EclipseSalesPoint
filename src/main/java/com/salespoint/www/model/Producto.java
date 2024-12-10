package com.salespoint.www.model;

import java.time.LocalDateTime;
import java.util.Collection;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    
    @Column(length = 60, nullable = false, unique = true)
    private String nombreProducto;
    
    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private Boolean estatusProducto;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT true")
    private short vendible;

    @Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
    private short paquete;
    
    @Column(nullable = false)
    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
    
    @JoinColumn(name = "categoriaIdCategoria", referencedColumnName = "idCategoria")
    @ManyToOne()
    private Categoria categoriaIdCategoria;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paqueteIdProducto")
    private Collection<Paquete> paqueteCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoIdProducto")
    private Collection<Paquete> paqueteCollection1;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoIdProducto")
    private Collection<SucursalProducto> sucursalProductoCollection;

}
