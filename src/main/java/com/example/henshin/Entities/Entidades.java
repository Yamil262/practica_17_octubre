package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Entidades públicas (ENTIDADES.DBF). Las 5 columnas SECTOR..NIVEL se reemplazan por la relación a EstEnt */
@Entity
@Table(name = "entidades", uniqueConstraints = @UniqueConstraint(columnNames = {"gestion", "entidad"}))
public class Entidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gestion")
    private Integer gestion;

    @Column(name = "entidad", length = 4)
    private String entidad;

    @Column(name = "desc_ent", length = 110)
    private String descEnt;

    @Column(name = "sigla_ent", length = 15)
    private String siglaEnt;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "est_ent_id", nullable = true)
    private EstEnt estEnt;

    public Entidades() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getGestion() { return gestion; }
    public void setGestion(Integer gestion) { this.gestion = gestion; }

    public String getEntidad() { return entidad; }
    public void setEntidad(String entidad) { this.entidad = entidad; }

    public String getDescEnt() { return descEnt; }
    public void setDescEnt(String descEnt) { this.descEnt = descEnt; }

    public String getSiglaEnt() { return siglaEnt; }
    public void setSiglaEnt(String siglaEnt) { this.siglaEnt = siglaEnt; }

    public EstEnt getEstEnt() { return estEnt; }
    public void setEstEnt(EstEnt estEnt) { this.estEnt = estEnt; }

}
