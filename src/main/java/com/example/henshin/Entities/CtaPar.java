package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Relaciona grupo contable con partida (CTA_PAR.DBF). Reemplaza CODCONT+PARTIDA+GESTION */
@Entity
@Table(name = "cta_par")
public class CtaPar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cod_cont_id", nullable = true)
    private CodCont codCont;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "obj_gasto_id", nullable = true)
    private ObjGasto objGasto;

    public CtaPar() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public CodCont getCodCont() { return codCont; }
    public void setCodCont(CodCont codCont) { this.codCont = codCont; }

    public ObjGasto getObjGasto() { return objGasto; }
    public void setObjGasto(ObjGasto objGasto) { this.objGasto = objGasto; }

}
