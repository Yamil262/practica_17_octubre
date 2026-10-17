package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Oficinas de una unidad (OFICINA.DBF) */
@Entity
@Table(name = "oficina", uniqueConstraints = @UniqueConstraint(columnNames = {"unidad_admin_id", "cod_ofic"}))
public class Oficina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @Column(name = "cod_ofic")
    private Integer codOfic;

    @Column(name = "nom_ofic", length = 65)
    private String nomOfic;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    @Column(name = "api_estado")
    private Integer apiEstado;

    public Oficina() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public Integer getCodOfic() { return codOfic; }
    public void setCodOfic(Integer codOfic) { this.codOfic = codOfic; }

    public String getNomOfic() { return nomOfic; }
    public void setNomOfic(String nomOfic) { this.nomOfic = nomOfic; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

    public Integer getApiEstado() { return apiEstado; }
    public void setApiEstado(Integer apiEstado) { this.apiEstado = apiEstado; }

}
