package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

/** Transferencias de activos (TRASFE.DBF). Se liga al activo por unidadAdmin + codigo (relación lógica) */
@Entity
@Table(name = "trasfe")
public class Trasfe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @Column(name = "codigo", length = 15)
    private String codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oficina_id", nullable = true)
    private Oficina oficina;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "resp_id", nullable = true)
    private Resp resp;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_ini_id", nullable = true)
    private UnidadAdmin unidadIni;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    public Trasfe() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Oficina getOficina() { return oficina; }
    public void setOficina(Oficina oficina) { this.oficina = oficina; }

    public Resp getResp() { return resp; }
    public void setResp(Resp resp) { this.resp = resp; }

    public UnidadAdmin getUnidadIni() { return unidadIni; }
    public void setUnidadIni(UnidadAdmin unidadIni) { this.unidadIni = unidadIni; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

}
