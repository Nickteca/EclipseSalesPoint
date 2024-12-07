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
public class Usuario {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short idUsuario;

	@Column(length = 20, nullable = false, unique = true)
    private String nombreUsuario;

	@Column(length = 100, nullable = false, unique = true)
    private String passwordUsuario;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime deletedAt;

    @JoinColumn(name = "rolIdRol", referencedColumnName = "idRol")
    @ManyToOne(optional = false)
    private Rol rolIdRol;
}
