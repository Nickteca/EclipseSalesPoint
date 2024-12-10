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
public class CorteDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idCorteDetalle;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float inventario;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float entrada;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float traspasoEntrada;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float venta;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float salida;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float traspasoSalida;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float existencia;
    
    @JoinColumn(name = "corteIdCorte", referencedColumnName = "idCorte")
    @ManyToOne(optional = false)
    private Corte corteIdCorte;
    
    @JoinColumn(name = "sucursalProductoIdSucursalProducto", referencedColumnName = "idSucursalProducto")
    @ManyToOne(optional = false)
    private SucursalProducto sucursalProductoIdSucursalProducto;
}
