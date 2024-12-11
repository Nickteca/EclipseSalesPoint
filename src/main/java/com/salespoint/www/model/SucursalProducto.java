package com.salespoint.www.model;

import java.util.Collection;

import jakarta.persistence.Basic;
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
public class SucursalProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idSucursalProducto;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(nullable = false)
    private float precio;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private float inventario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalProductoIdSucursalProducto")
    private Collection<MovimientoDetalle> movimientoDetalleCollection;
    
    @JoinColumn(name = "productoIdProducto", referencedColumnName = "idProducto")
    @ManyToOne(optional = false)
    private Producto productoIdProducto;
    
    @JoinColumn(name = "sucursalIdSucursal", referencedColumnName = "idSucursal")
    @ManyToOne(optional = false)
    private Sucursal sucursalIdSucursal;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalProductoIdSucursalProducto")
    private Collection<CorteDetalle> corteDetalleCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalProductoIdSucursalProducto")
    private Collection<VentaDetalle> ventaDetalleCollection;
}
