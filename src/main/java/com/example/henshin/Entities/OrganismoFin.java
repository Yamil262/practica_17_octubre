package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Organismos financiadores (ORGANISMO_FIN.DBF). Columna OF renombrada a cod_of */
@Entity
@Table(name = "organismo_fin", uniqueConstraints = @UniqueConstraint(columnNames = {"gestion", "cod_of"}))
public class OrganismoFin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gestion")
    private Integer gestion;

    @Column(name = "cod_of", length = 3)
    private String codOf;

    @Column(name = "des", length = 100)
    private String des;

    @Column(name = "sigla", length = 15)
    private String sigla;

    public OrganismoFin() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getGestion() { return gestion; }
    public void setGestion(Integer gestion) { this.gestion = gestion; }

    public String getCodOf() { return codOf; }
    public void setCodOf(String codOf) { this.codOf = codOf; }

    public String getDes() { return des; }
    public void setDes(String des) { this.des = des; }

    public String getSigla() { return sigla; }
    public void setSigla(String sigla) { this.sigla = sigla; }

}
