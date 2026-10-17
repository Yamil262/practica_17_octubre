package com.example.henshin.Entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

/** Activos fijos vigentes (ACTUAL.DBF) - tabla central */
@Entity
@Table(name = "actual", uniqueConstraints = @UniqueConstraint(columnNames = {"unidad_admin_id", "codigo"}))
public class Actual {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidad_admin_id", nullable = false)
    private UnidadAdmin unidadAdmin;

    @Column(name = "codigo", length = 15)
    private String codigo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_cont_id", nullable = false)
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estado_id", nullable = true)
    private Estado estado;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "organismo_fin_id", nullable = true)
    private OrganismoFin organismoFin;

    @Column(name = "vida_util", precision = 6, scale = 2)
    private BigDecimal vidaUtil;

    @Column(name = "descrip", length = 150)
    private String descrip;

    @Column(name = "costo", precision = 15, scale = 2)
    private BigDecimal costo;

    @Column(name = "dep_acu", precision = 15, scale = 2)
    private BigDecimal depAcu;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "ano")
    private Integer ano;

    @Column(name = "b_rev")
    private Boolean bRev;

    @Column(name = "dia")
    private Integer dia;

    @Column(name = "observ", columnDefinition = "text")
    private String observ;

    @Column(name = "dia_ant")
    private Integer diaAnt;

    @Column(name = "mes_ant")
    private Integer mesAnt;

    @Column(name = "ano_ant")
    private Integer anoAnt;

    @Column(name = "vut_ant")
    private Integer vutAnt;

    @Column(name = "costo_ant", precision = 15, scale = 2)
    private BigDecimal costoAnt;

    @Column(name = "band_ufv")
    private Boolean bandUfv;

    @Column(name = "cod_rube", length = 15)
    private String codRube;

    @Column(name = "nro_conv", length = 10)
    private String nroConv;

    @Column(name = "feult")
    private LocalDate feult;

    @Column(name = "usuar", length = 8)
    private String usuar;

    @Column(name = "api_estado")
    private Integer apiEstado;

    @Column(name = "codigo_sec", length = 15)
    private String codigoSec;

    @Column(name = "banderas", length = 12)
    private String banderas;

    @Column(name = "fec_mod")
    private LocalDate fecMod;

    @Column(name = "usu_mod", length = 8)
    private String usuMod;

    public Actual() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UnidadAdmin getUnidadAdmin() { return unidadAdmin; }
    public void setUnidadAdmin(UnidadAdmin unidadAdmin) { this.unidadAdmin = unidadAdmin; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public CodCont getCodCont() { return codCont; }
    public void setCodCont(CodCont codCont) { this.codCont = codCont; }

    public Auxiliar getAuxiliar() { return auxiliar; }
    public void setAuxiliar(Auxiliar auxiliar) { this.auxiliar = auxiliar; }

    public Oficina getOficina() { return oficina; }
    public void setOficina(Oficina oficina) { this.oficina = oficina; }

    public Resp getResp() { return resp; }
    public void setResp(Resp resp) { this.resp = resp; }

    public Estado getEstado() { return estado; }
    public void setEstado(Estado estado) { this.estado = estado; }

    public OrganismoFin getOrganismoFin() { return organismoFin; }
    public void setOrganismoFin(OrganismoFin organismoFin) { this.organismoFin = organismoFin; }

    public BigDecimal getVidaUtil() { return vidaUtil; }
    public void setVidaUtil(BigDecimal vidaUtil) { this.vidaUtil = vidaUtil; }

    public String getDescrip() { return descrip; }
    public void setDescrip(String descrip) { this.descrip = descrip; }

    public BigDecimal getCosto() { return costo; }
    public void setCosto(BigDecimal costo) { this.costo = costo; }

    public BigDecimal getDepAcu() { return depAcu; }
    public void setDepAcu(BigDecimal depAcu) { this.depAcu = depAcu; }

    public Integer getMes() { return mes; }
    public void setMes(Integer mes) { this.mes = mes; }

    public Integer getAno() { return ano; }
    public void setAno(Integer ano) { this.ano = ano; }

    public Boolean getBRev() { return bRev; }
    public void setBRev(Boolean bRev) { this.bRev = bRev; }

    public Integer getDia() { return dia; }
    public void setDia(Integer dia) { this.dia = dia; }

    public String getObserv() { return observ; }
    public void setObserv(String observ) { this.observ = observ; }

    public Integer getDiaAnt() { return diaAnt; }
    public void setDiaAnt(Integer diaAnt) { this.diaAnt = diaAnt; }

    public Integer getMesAnt() { return mesAnt; }
    public void setMesAnt(Integer mesAnt) { this.mesAnt = mesAnt; }

    public Integer getAnoAnt() { return anoAnt; }
    public void setAnoAnt(Integer anoAnt) { this.anoAnt = anoAnt; }

    public Integer getVutAnt() { return vutAnt; }
    public void setVutAnt(Integer vutAnt) { this.vutAnt = vutAnt; }

    public BigDecimal getCostoAnt() { return costoAnt; }
    public void setCostoAnt(BigDecimal costoAnt) { this.costoAnt = costoAnt; }

    public Boolean getBandUfv() { return bandUfv; }
    public void setBandUfv(Boolean bandUfv) { this.bandUfv = bandUfv; }

    public String getCodRube() { return codRube; }
    public void setCodRube(String codRube) { this.codRube = codRube; }

    public String getNroConv() { return nroConv; }
    public void setNroConv(String nroConv) { this.nroConv = nroConv; }

    public LocalDate getFeult() { return feult; }
    public void setFeult(LocalDate feult) { this.feult = feult; }

    public String getUsuar() { return usuar; }
    public void setUsuar(String usuar) { this.usuar = usuar; }

    public Integer getApiEstado() { return apiEstado; }
    public void setApiEstado(Integer apiEstado) { this.apiEstado = apiEstado; }

    public String getCodigoSec() { return codigoSec; }
    public void setCodigoSec(String codigoSec) { this.codigoSec = codigoSec; }

    public String getBanderas() { return banderas; }
    public void setBanderas(String banderas) { this.banderas = banderas; }

    public LocalDate getFecMod() { return fecMod; }
    public void setFecMod(LocalDate fecMod) { this.fecMod = fecMod; }

    public String getUsuMod() { return usuMod; }
    public void setUsuMod(String usuMod) { this.usuMod = usuMod; }

}
