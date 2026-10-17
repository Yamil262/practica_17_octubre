package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/** Revalorizaciones (REVAL.DBF). Se liga al activo por unidadAdmin + codigo (relación lógica) */
@Entity
@Table(name = "reval")
public class Reval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @Column(name = "codigo", length = 15)
    private String codigo;

    @Column(name = "costo", precision = 15, scale = 2)
    private BigDecimal costo;

    @Column(name = "dep_acu_ant", precision = 15, scale = 2)
    private BigDecimal depAcuAnt;

    @Column(name = "d_reval")
    private Integer dReval;

    @Column(name = "dia")
    private Integer dia;

    @Column(name = "m_reval")
    private Integer mReval;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "a_reval")
    private Integer aReval;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "vida_util", precision = 5, scale = 2)
    private BigDecimal vidaUtil;

    @Column(name = "resolucion", length = 16)
    private String resolucion;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "usuar", length = 8)
    private String usuar;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "dep_acu", precision = 15, scale = 2)
    private BigDecimal depAcu;

    @Column(name = "actua", precision = 15, scale = 2)
    private BigDecimal actua;

    @Column(name = "dep_gestion", precision = 15, scale = 2)
    private BigDecimal depGestion;

    @Column(name = "fec_mod")
    private LocalDate fecMod;

    @Column(name = "usu_mod", length = 8)
    private String usuMod;

    public Reval() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public BigDecimal getDepAcuAnt() { return depAcuAnt; }
    public void setDepAcuAnt(BigDecimal depAcuAnt) { this.depAcuAnt = depAcuAnt; }

    public Integer getDReval() { return dReval; }
    public void setDReval(Integer dReval) { this.dReval = dReval; }

    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }

    public Integer getMReval() { return mReval; }
    public void setMReval(Integer mReval) { this.mReval = mReval; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public Integer getAReval() { return aReval; }
    public void setAReval(Integer aReval) { this.aReval = aReval; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public BigDecimal getVidaUtil() { return vidaUtil; }
    public void setVidaUtil(BigDecimal vidaUtil) { this.vidaUtil = vidaUtil; }

    public String getResolucion() { return resolucion; }
    public void setResolucion(String resolucion) { this.resolucion = resolucion; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public BigDecimal getDepAcu() { return depAcu; }
    public void setDepAcu(BigDecimal depAcu) { this.depAcu = depAcu; }

    public BigDecimal getActua() { return actua; }
    public void setActua(BigDecimal actua) { this.actua = actua; }

    public BigDecimal getDepGestion() { return depGestion; }
    public void setDepGestion(BigDecimal depGestion) { this.depGestion = depGestion; }

    public LocalDate getFecMod() { return fecMod; }
    public void setFecMod(LocalDate fecMod) { this.fecMod = fecMod; }

    public String getUsuMod() { return usuMod; }
    public void setUsuMod(String usuMod) { this.usuMod = usuMod; }

}
