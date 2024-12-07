package com.salespoint.www.model;

import java.util.Date;

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
public class Sucursal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idSucursal;

    private String nombreSucursal;

    private String calleSucursal;

    private String ciudadSucursal;

    private String estadoSucursal;

    private String telefonoSucursal;

    private boolean estatusSucursal;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
    /*@OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
    private Collection<MovimientoCaja> movimientoCajaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
    private Collection<Venta> ventaCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
    private Collection<GastoSucursal> gastoSucursalCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
    private Collection<Movimiento> movimientoCollection;
    @OneToMany(mappedBy = "destinoIdSucursal")
    private Collection<Movimiento> movimientoCollection1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
    private Collection<SucursalProducto> sucursalProductoCollection;*/
    
    @JoinColumn(name = "empresa_id_empresa", referencedColumnName = "id_empresa")
    @ManyToOne(optional = false)
    private Empresa empresaIdEmpresa;
}
