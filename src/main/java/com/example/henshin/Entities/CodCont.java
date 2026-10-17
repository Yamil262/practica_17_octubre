package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Grupos contables (CODCONT.DBF) */
@Entity
@Table(name = "codcont", uniqueConstraints = @UniqueConstraint(columnNames = {"cod_cont"}))
public class CodCont {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_cont")
    private Integer codCont;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "vida_util")
    private Integer vidaUtil;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "depreciar")
    private Boolean depreciar;

    @Column(name = "actualizar")
    private Boolean actualizar;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    public CodCont() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Integer getCodCont() { return codCont; }
    public void setCodCont(Integer codCont) { this.codCont = codCont; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Integer getVidaUtil() { return vidaUtil; }
    public void setVidaUtil(Integer vidaUtil) { this.vidaUtil = vidaUtil; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public Boolean getDepreciar() { return depreciar; }
    public void setDepreciar(Boolean depreciar) { this.depreciar = depreciar; }

    public Boolean getActualizar() { return actualizar; }
    public void setActualizar(Boolean actualizar) { this.actualizar = actualizar; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

}
