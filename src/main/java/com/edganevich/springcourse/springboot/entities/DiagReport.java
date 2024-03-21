package com.edganevich.springcourse.springboot.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "diag_reports")
@Data
@NoArgsConstructor
public class DiagReport {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "date_of_report")
    private Date dateOfReport;

    @Column(name = "number_of_report")
    private String numberOfReport;

    @Column(name = "reference_of_report")
    private String referenceOfReport;

    @OneToOne
    @JoinColumn(name="diagcompany_id", nullable=false)
    private DiagCompany diagCompany;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name="equipment_id", nullable=false)
    private Equipment equipment;


}
