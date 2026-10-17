package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Catálogo de meses (MES.DBF) */
@Entity
@Table(name = "mes", uniqueConstraints = @UniqueConstraint(columnNames = {"mes"}))
public class Mes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "nom_mes", length = 10)
    private String nomMes;

    public Mes() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public String getNomMes() { return nomMes; }
    public void setNomMes(String nomMes) { this.nomMes = nomMes; }

}
