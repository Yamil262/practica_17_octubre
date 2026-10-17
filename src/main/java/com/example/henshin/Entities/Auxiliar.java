package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Auxiliares contables (AUXILIAR.DBF) */
@Entity
@Table(name = "auxiliar", uniqueConstraints = @UniqueConstraint(columnNames = {"unidad_admin_id", "cod_cont_id", "cod_aux"}))
public class Auxiliar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_cont_id", nullable = false)
    private CodCont codCont;

    @Column(name = "cod_aux")
    private Integer codAux;

    @Column(name = "nom_aux", length = 50)
    private String nomAux;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    public Auxiliar() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public CodCont getCodCont() { return codCont; }
    public void setCodCont(CodCont codCont) { this.codCont = codCont; }

    public Integer getCodAux() { return codAux; }
    public void setCodAux(Integer codAux) { this.codAux = codAux; }

    public String getNomAux() { return nomAux; }
    public void setNomAux(String nomAux) { this.nomAux = nomAux; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

}
