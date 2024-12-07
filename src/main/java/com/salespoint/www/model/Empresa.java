package com.salespoint.www.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Date;

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
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idEmpresa;
    
    @Column(length = 50, nullable = false, unique = true)
    private String nombreEmpresa;

    @Column(length = 100, nullable = false, unique = true)
    private String direccionEmpresa;

    @Column(length = 10)
    private String telefonoEmpresa;

    @Column(length = 20, nullable = false, unique = true)
    private String rfcEmpresa;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;
    
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaIdEmpresa")
    private Collection<Sucursal> sucursalCollection;
}
