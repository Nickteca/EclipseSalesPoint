package com.salespoint.www.model;

import java.time.LocalDateTime;

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
public class Sucursal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idSucursal;

	@Column(length = 50, nullable = false, unique = true)
	private String nombreSucursal;
	@Column(length = 100)
	private String calleSucursal;
	@Column(length = 50)
	private String ciudadSucursal;
	@Column(length = 50)
	private String estadoSucursal;
	@Column(length = 10)
	private String telefonoSucursal;
	@Column(nullable = false, columnDefinition = "BOOLEAN DEFAULT false")
	private boolean estatusSucursal;
	
	private LocalDateTime createdAt;

	private LocalDateTime updatedAt;

	private LocalDateTime deletedAt;
	/*
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
	 * private Collection<MovimientoCaja> movimientoCajaCollection;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
	 * private Collection<Venta> ventaCollection;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
	 * private Collection<GastoSucursal> gastoSucursalCollection;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
	 * private Collection<Movimiento> movimientoCollection;
	 * 
	 * @OneToMany(mappedBy = "destinoIdSucursal") private Collection<Movimiento>
	 * movimientoCollection1;
	 * 
	 * @OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdSucursal")
	 * private Collection<SucursalProducto> sucursalProductoCollection;
	 */

	@JoinColumn(name = "empresaIdEmpresa", referencedColumnName = "idEmpresa")
	@ManyToOne(optional = false)
	private Empresa empresaIdEmpresa;
}
