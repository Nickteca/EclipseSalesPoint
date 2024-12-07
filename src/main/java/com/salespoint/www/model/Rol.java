package com.salespoint.www.model;

import java.util.Collection;

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
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Short idRol;
	@Column(nullable = false, unique = true, length = 20)
	private String nombreRol;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "rolIdRol")
	private Collection<Usuario> usuarioCollection;
}
