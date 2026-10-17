package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Catálogo de motivos de baja (BAJA.DBF) */
@Entity
@Table(name = "baja", uniqueConstraints = @UniqueConstraint(columnNames = {"cod_baja"}))
public class Baja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_baja")
    private Integer codBaja;

    @Column(name = "desc_baja", length = 120)
    private String descBaja;

    public Baja() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCodBaja() { return codBaja; }
    public void setCodBaja(Integer codBaja) { this.codBaja = codBaja; }

    public String getDescBaja() { return descBaja; }
    public void setDescBaja(String descBaja) { this.descBaja = descBaja; }

}
