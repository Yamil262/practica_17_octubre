package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Estructura institucional (EST_ENT.DBF) */
@Entity
@Table(name = "est_ent", uniqueConstraints = @UniqueConstraint(columnNames = {"gestion", "sector_ent", "subsec_ent", "area_ent", "subarea_ent", "nivel_inst"}))
public class EstEnt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gestion")
    private Integer gestion;

    @Column(name = "sector_ent")
    private Integer sectorEnt;

    @Column(name = "subsec_ent")
    private Integer subsecEnt;

    @Column(name = "area_ent")
    private Integer areaEnt;

    @Column(name = "subarea_ent")
    private Integer subareaEnt;

    @Column(name = "nivel_inst")
    private Integer nivelInst;

    @Column(name = "des_estruc", length = 60)
    private String desEstruc;

    @Column(name = "sigla_estru", length = 15)
    private String siglaEstru;

    @Column(name = "apropiable", length = 1)
    private String apropiable;

    public EstEnt() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getGestion() { return gestion; }
    public void setGestion(Integer gestion) { this.gestion = gestion; }

    public Integer getSectorEnt() { return sectorEnt; }
    public void setSectorEnt(Integer sectorEnt) { this.sectorEnt = sectorEnt; }

    public Integer getSubsecEnt() { return subsecEnt; }
    public void setSubsecEnt(Integer subsecEnt) { this.subsecEnt = subsecEnt; }

    public Integer getAreaEnt() { return areaEnt; }
    public void setAreaEnt(Integer areaEnt) { this.areaEnt = areaEnt; }

    public Integer getSubareaEnt() { return subareaEnt; }
    public void setSubareaEnt(Integer subareaEnt) { this.subareaEnt = subareaEnt; }

    public Integer getNivelInst() { return nivelInst; }
    public void setNivelInst(Integer nivelInst) { this.nivelInst = nivelInst; }

    public String getDesEstruc() { return desEstruc; }
    public void setDesEstruc(String desEstruc) { this.desEstruc = desEstruc; }

    public String getSiglaEstru() { return siglaEstru; }
    public void setSiglaEstru(String siglaEstru) { this.siglaEstru = siglaEstru; }

    public String getApropiable() { return apropiable; }
    public void setApropiable(String apropiable) { this.apropiable = apropiable; }

}
