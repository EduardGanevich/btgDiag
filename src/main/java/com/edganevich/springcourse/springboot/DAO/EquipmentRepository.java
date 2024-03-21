package com.edganevich.springcourse.springboot.DAO;

import com.edganevich.springcourse.springboot.entities.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {

}
