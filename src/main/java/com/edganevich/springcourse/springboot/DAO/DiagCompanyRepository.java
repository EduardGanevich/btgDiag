package com.edganevich.springcourse.springboot.DAO;

import com.edganevich.springcourse.springboot.entities.DiagCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagCompanyRepository extends JpaRepository<DiagCompany, Integer> {
}
