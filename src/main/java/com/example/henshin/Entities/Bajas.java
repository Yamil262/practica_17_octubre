package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/** Activos dados de baja (BAJAS.DBF) */
@Entity
@Table(name = "bajas", uniqueConstraints = @UniqueConstraint(columnNames = {"unidad_admin_id", "codigo"}))
public class Bajas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @Column(name = "codigo", length = 15)
    private String codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "baja_id", nullable = true)
    private Baja baja;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_cont_id", nullable = true)
    private CodCont codCont;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "auxiliar_id", nullable = true)
    private Auxiliar auxiliar;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "oficina_id", nullable = true)
    private Oficina oficina;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "resp_id", nullable = true)
    private Resp resp;

    @Column(name = "costo", precision = 15, scale = 2)
    private BigDecimal costo;

    @Column(name = "dep_acu_ant", precision = 15, scale = 2)
    private BigDecimal depAcuAnt;

    @Column(name = "descrip", length = 120)
    private String descrip;

    @Column(name = "d_baja")
    private Integer dBaja;

    @Column(name = "dia")
    private Integer dia;

    @Column(name = "m_baja")
    private Integer mBaja;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "a_baja")
    private Integer aBaja;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "b_rev")
    private Boolean bRev;

    @Column(name = "vida_util", precision = 5, scale = 2)
    private BigDecimal vidaUtil;

    @Column(name = "resolucion", length = 16)
    private String resolucion;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "motivo", length = 120)
    private String motivo;

    @Column(name = "dep_acu", precision = 15, scale = 2)
    private BigDecimal depAcu;

    @Column(name = "actua", precision = 15, scale = 2)
    private BigDecimal actua;

    @Column(name = "dep_gestion", precision = 15, scale = 2)
    private BigDecimal depGestion;

    @Column(name = "cos_baj_ini", precision = 15, scale = 2)
    private BigDecimal cosBajIni;

    @Column(name = "cos_da_ini", precision = 15, scale = 2)
    private BigDecimal cosDaIni;

    @Column(name = "cos_act_baj", precision = 15, scale = 2)
    private BigDecimal cosActBaj;

    @Column(name = "act_da_baj", precision = 15, scale = 2)
    private BigDecimal actDaBaj;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    @Column(name = "fec_mod")
    private LocalDate fecMod;

    @Column(name = "usu_mod", length = 8)
    private String usuMod;

    public Bajas() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public Baja getBaja() { return baja; }
    public void setBaja(Baja baja) { this.baja = baja; }

    public CodCont getCodCont() { return codCont; }
    public void setCodCont(CodCont codCont) { this.codCont = codCont; }

    public Auxiliar getAuxiliar() { return auxiliar; }
    public void setAuxiliar(Auxiliar auxiliar) { this.auxiliar = auxiliar; }

    public Oficina getOficina() { return oficina; }
    public void setOficina(Oficina oficina) { this.oficina = oficina; }

    public Resp getResp() { return resp; }
    public void setResp(Resp resp) { this.resp = resp; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public BigDecimal getDepAcuAnt() { return depAcuAnt; }
    public void setDepAcuAnt(BigDecimal depAcuAnt) { this.depAcuAnt = depAcuAnt; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }

    public Integer getDBaja() { return dBaja; }
    public void setDBaja(Integer dBaja) { this.dBaja = dBaja; }

    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }

    public Integer getMBaja() { return mBaja; }
    public void setMBaja(Integer mBaja) { this.mBaja = mBaja; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public Integer getABaja() { return aBaja; }
    public void setABaja(Integer aBaja) { this.aBaja = aBaja; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public Boolean getBRev() { return bRev; }
    public void setBRev(Boolean bRev) { this.bRev = bRev; }

    public BigDecimal getVidaUtil() { return vidaUtil; }
    public void setVidaUtil(BigDecimal vidaUtil) { this.vidaUtil = vidaUtil; }

    public String getResolucion() { return resolucion; }
    public void setResolucion(String resolucion) { this.resolucion = resolucion; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }

    public BigDecimal getDepAcu() { return depAcu; }
    public void setDepAcu(BigDecimal depAcu) { this.depAcu = depAcu; }

    public BigDecimal getActua() { return actua; }
    public void setActua(BigDecimal actua) { this.actua = actua; }

    public BigDecimal getDepGestion() { return depGestion; }
    public void setDepGestion(BigDecimal depGestion) { this.depGestion = depGestion; }

    public BigDecimal getCosBajIni() { return cosBajIni; }
    public void setCosBajIni(BigDecimal cosBajIni) { this.cosBajIni = cosBajIni; }

    public BigDecimal getCosDaIni() { return cosDaIni; }
    public void setCosDaIni(BigDecimal cosDaIni) { this.cosDaIni = cosDaIni; }

    public BigDecimal getCosActBaj() { return cosActBaj; }
    public void setCosActBaj(BigDecimal cosActBaj) { this.cosActBaj = cosActBaj; }

    public BigDecimal getActDaBaj() { return actDaBaj; }
    public void setActDaBaj(BigDecimal actDaBaj) { this.actDaBaj = actDaBaj; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

    public LocalDate getFecMod() { return fecMod; }
    public void setFecMod(LocalDate fecMod) { this.fecMod = fecMod; }

    public String getUsuMod() { return usuMod; }
    public void setUsuMod(String usuMod) { this.usuMod = usuMod; }

}
