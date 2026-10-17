package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Unidades administrativas (UNIDADADMIN.DBF) */
@Entity
@Table(name = "unidadadmin", uniqueConstraints = @UniqueConstraint(columnNames = {"entidad_id", "unidad"}))
public class UnidadAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "entidad_id", nullable = false)
    private Entidades entidad;

    @Column(name = "unidad", length = 5)
    private String unidad;

    @Column(name = "descrip", length = 120)
    private String descrip;

    @Column(name = "ciudad", length = 20)
    private String ciudad;

    @Column(name = "estado_uni")
    private Integer estadoUni;

    public UnidadAdmin() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Entidades getEntidad() { return entidad; }
    public void setEntidad(Entidades entidad) { this.entidad = entidad; }

    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }

    public String getCiudad() { return ciudad; }
    public void setCiudad(String ciudad) { this.ciudad = ciudad; }

    public Integer getEstadoUni() { return estadoUni; }
    public void setEstadoUni(Integer estadoUni) { this.estadoUni = estadoUni; }

}
