package com.edganevich.springcourse.springboot.DAO;

import com.edganevich.springcourse.springboot.entities.DiagReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagReportRepository extends JpaRepository<DiagReport, Integer> {
}
