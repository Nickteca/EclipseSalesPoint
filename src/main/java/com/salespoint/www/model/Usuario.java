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
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idUsuario;

    private String nombreUsuario;

    private String passwordUsuario;

    private Date createdAt;

    private Date updatedAt;

    private Date deletedAt;

    @JoinColumn(name = "rol_id_rol", referencedColumnName = "id_rol")
    @ManyToOne(optional = false)
    private Rol rolIdRol;
}
