/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csa.samplefullstack.repository;

/**
 *
 * @author User
 */
import com.csa.samplefullstack.entity.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
