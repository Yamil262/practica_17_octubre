package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Catálogo: Bueno/Regular/Malo (ESTADO.DBF) */
@Entity
@Table(name = "estado", uniqueConstraints = @UniqueConstraint(columnNames = {"cod_estado"}))
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_estado")
    private Integer codEstado;

    @Column(name = "nom_estado", length = 10)
    private String nomEstado;

    public Estado() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCodEstado() { return codEstado; }
    public void setCodEstado(Integer codEstado) { this.codEstado = codEstado; }

    public String getNomEstado() { return nomEstado; }
    public void setNomEstado(String nomEstado) { this.nomEstado = nomEstado; }

}
