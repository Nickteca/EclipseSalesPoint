package com.salespoint.www.model;

import java.util.Collection;
import java.util.Date;

import jakarta.persistence.CascadeType;
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
    
    private String nombreEmpresa;

    private String direccionEmpresa;

    private String telefonoEmpresa;

    private String rfcEmpresa;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empresaIdEmpresa")
    private Collection<Sucursal> sucursalCollection;
}
