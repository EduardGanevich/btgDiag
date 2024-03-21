package com.edganevich.springcourse.springboot.entities;

import java.util.*;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "equipments")
@Data
@NoArgsConstructor
public class Equipment {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "filial")
    private Filial filial;

    @Enumerated(EnumType.STRING)
    @Column(name = "equipment_type")
    private EquipmentType equipmentType;

    @Enumerated(EnumType.STRING)
    @Column(name = "department")
    private Department department;

    @Column(name = "place_of_Install")
    private String placeOfInstall;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "inv_number")
    private String invNumber;

    @Column(name = "reg_number")
    private String regNumber;

    @Column(name = "date_of_start_expl")
    private Integer dateOfStartExpl;

    @Column(name = "life_resource")
    private Integer lifeResource;

    @Column(name = "is_passport")
    private Boolean isPassport;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_of_diagnostic")
    private TypeOfDiagnostic typeOfDiagnostic;

    @OneToMany(mappedBy="equipment")
    private List<DiagReport> reportList;


}
