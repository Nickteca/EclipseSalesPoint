package com.salespoint.www.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Folio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Short idFolio;
	
    @Basic(optional = false)
    @Column(nullable = false,length = 4)
    private String acronimoFolio;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private int numeroFolio;
    
    @Basic(optional = false)
    @Column(nullable = false)
    private Character naturalezaFolio;
}
