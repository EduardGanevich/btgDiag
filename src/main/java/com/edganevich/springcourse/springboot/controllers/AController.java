package com.edganevich.springcourse.springboot.controllers;

import com.edganevich.springcourse.springboot.DAO.DiagCompanyRepository;
import com.edganevich.springcourse.springboot.DAO.DiagReportRepository;
import com.edganevich.springcourse.springboot.DAO.EquipmentRepository;


import com.edganevich.springcourse.springboot.entities.Equipment;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AController {

    @Autowired
    private EquipmentRepository equipmentRepository;
    @Autowired
    private DiagReportRepository diagReportRepository;
    @Autowired
    private DiagCompanyRepository diagCompanyRepository;
//
//    @Bean
//    public InternalResourceViewResolver getResolver(){
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("WEB-INF/view");
//        resolver.setSuffix(".jsp");
//        resolver.setViewClass(JstlView.class);
//        return resolver;
//    }

    @GetMapping("/Allequip")
    public String getAll(Model model){
     List<Equipment> AllEquipments =  equipmentRepository.findAll();

     model.addAttribute("equipment", AllEquipments);

        return "All-equip";
    }


}
