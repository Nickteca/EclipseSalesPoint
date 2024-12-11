package com.salespoint.www.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Paquete {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
    @Column(nullable = false)
    private Integer idPaquete;
	
    @Column(nullable = false)
    private float unidades;
    
    @JoinColumn(name = "paqueteIdProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto paqueteIdProducto;
    
    @JoinColumn(name = "productoIdProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto productoIdProducto;
}
