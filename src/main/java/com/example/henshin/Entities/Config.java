package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Configuración por usuario (CONFIG.DBF) */
@Entity
@Table(name = "config")
public class Config {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entidad_id", nullable = true)
    private Entidades entidad;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = true)
    private UnidadAdmin unidadAdmin;

    @Column(name = "desc_ent", length = 120)
    private String descEnt;

    @Column(name = "desc_uni", length = 120)
    private String descUni;

    @Column(name = "usuario", length = 10)
    private String usuario;

    public Config() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Entidades getEntidad() { return entidad; }
    public void setEntidad(Entidades entidad) { this.entidad = entidad; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public String getDescEnt() { return descEnt; }
    public void setDescEnt(String descEnt) { this.descEnt = descEnt; }

    public String getDescUni() { return descUni; }
    public void setDescUni(String descUni) { this.descUni = descUni; }

    public String getUsuario() { return usuario; }
    public void setUsuario(String usuario) { this.usuario = usuario; }

}
