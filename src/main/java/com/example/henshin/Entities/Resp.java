package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Responsables de una oficina (RESP.DBF). COD_EXP apunta a ClaDepts */
@Entity
@Table(name = "resp", uniqueConstraints = @UniqueConstraint(columnNames = {"oficina_id", "cod_resp"}))
public class Resp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oficina_id", nullable = false)
    private Oficina oficina;

    @Column(name = "cod_resp")
    private Integer codResp;

    @Column(name = "nom_resp", length = 35)
    private String nomResp;

    @Column(name = "cargo", length = 35)
    private String cargo;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "ci", length = 20)
    private String ci;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_exp_id", nullable = true)
    private ClaDepts expedido;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    @Column(name = "api_estado")
    private Integer apiEstado;

    public Resp() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Oficina getOficina() { return oficina; }
    public void setOficina(Oficina oficina) { this.oficina = oficina; }

    public Integer getCodResp() { return codResp; }
    public void setCodResp(Integer codResp) { this.codResp = codResp; }

    public String getNomResp() { return nomResp; }
    public void setNomResp(String nomResp) { this.nomResp = nomResp; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public String getCi() { return ci; }
    public void setCi(String ci) { this.ci = ci; }

    public ClaDepts getExpedido() { return expedido; }
    public void setExpedido(ClaDepts expedido) { this.expedido = expedido; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

    public Integer getApiEstado() { return apiEstado; }
    public void setApiEstado(Integer apiEstado) { this.apiEstado = apiEstado; }

}
