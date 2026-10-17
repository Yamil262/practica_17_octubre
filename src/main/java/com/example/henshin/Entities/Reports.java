package com.example.henshin.Entities;

import jakarta.persistence.*;

/** Catálogo de reportes de FoxPro (REPORTS.DBF). Se omiten CB1..CB28 (binarios internos de VFP) */
@Entity
@Table(name = "reports")
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "report_name", length = 8)
    private String reportName;

    @Column(name = "contents", length = 50)
    private String contents;

    @Column(name = "mod_type", length = 8)
    private String modType;

    @Column(name = "notes", columnDefinition = "text")
    private String notes;

    public Reports() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getReportName() { return reportName; }
    public void setReportName(String reportName) { this.reportName = reportName; }

    public String getContents() { return contents; }
    public void setContents(String contents) { this.contents = contents; }

    public String getModType() { return modType; }
    public void setModType(String modType) { this.modType = modType; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

}
