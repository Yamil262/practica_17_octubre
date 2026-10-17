package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Preferencias de FoxPro (ORGUSER.DBF) - independiente */
@Entity
@Table(name = "orguser")
public class OrgUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tipo", length = 12)
    private String tipo;

    @Column(name = "obj_id", length = 12)
    private String objId;

    @Column(name = "nombre", length = 24)
    private String nombre;

    @Column(name = "solo_lectura")
    private Boolean soloLectura;

    @Column(name = "ckval")
    private Integer ckval;

    @Column(name = "datos", columnDefinition = "text")
    private String datos;

    @Column(name = "actualizado")
    private LocalDate actualizado;

    public OrgUser() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getObjId() { return objId; }
    public void setObjId(String objId) { this.objId = objId; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Boolean getSoloLectura() { return soloLectura; }
    public void setSoloLectura(Boolean soloLectura) { this.soloLectura = soloLectura; }

    public Integer getCkval() { return ckval; }
    public void setCkval(Integer ckval) { this.ckval = ckval; }

    public String getDatos() { return datos; }
    public void setDatos(String datos) { this.datos = datos; }

    public LocalDate getActualizado() { return actualizado; }
    public void setActualizado(LocalDate actualizado) { this.actualizado = actualizado; }

}
