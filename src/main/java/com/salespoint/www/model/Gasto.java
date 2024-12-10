package com.salespoint.www.model;

import java.time.LocalDateTime;
import java.util.Collection;

import jakarta.persistence.Basic;
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
public class Gasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer idGastos;
    
    @Basic(optional = false)
    @Column(nullable = false, length = 100)
    private String descripcionGasto;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private LocalDateTime createdAt;
    
    @Basic(optional = true)
    @Column(nullable = false)
    private LocalDateTime updatedAt;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gastoIdGastos")
    private Collection<GastoSucursal> gastoSucursalCollection;
}
