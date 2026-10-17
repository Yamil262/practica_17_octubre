package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Partidas presupuestarias por gestión (OBJGASTO.DBF) */
@Entity
@Table(name = "objgasto", uniqueConstraints = @UniqueConstraint(columnNames = {"gestion", "partida"}))
public class ObjGasto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "gestion")
    private Integer gestion;

    @Column(name = "partida", length = 5)
    private String partida;

    @Column(name = "descrip", length = 50)
    private String descrip;

    public ObjGasto() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getGestion() { return gestion; }
    public void setGestion(Integer gestion) { this.gestion = gestion; }

    public String getPartida() { return partida; }
    public void setPartida(String partida) { this.partida = partida; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }

}
