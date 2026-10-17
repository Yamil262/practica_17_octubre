package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Tabla auxiliar de 1 columna (DATA.DBF) - independiente */
@Entity
@Table(name = "data")
public class Data {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "dato", length = 50)
    private String dato;

    public Data() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDato() { return dato; }
    public void setDato(String dato) { this.dato = dato; }

}
