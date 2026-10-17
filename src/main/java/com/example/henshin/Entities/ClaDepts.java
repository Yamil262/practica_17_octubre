package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Catálogo de departamentos de Bolivia (CLA_DEPTS.DBF) */
@Entity
@Table(name = "cla_depts", uniqueConstraints = @UniqueConstraint(columnNames = {"codigo"}))
public class ClaDepts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "descripcion", length = 15)
    private String descripcion;

    @Column(name = "sigla", length = 10)
    private String sigla;

    public ClaDepts() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCodigo() { return codigo; }
    public void setCodigo(Integer codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }

}
