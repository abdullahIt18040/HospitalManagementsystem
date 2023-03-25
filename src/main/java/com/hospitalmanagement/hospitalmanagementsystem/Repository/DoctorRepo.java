package com.hospitalmanagement.hospitalmanagementsystem.Repository;

import com.hospitalmanagement.hospitalmanagementsystem.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository <Doctor,Long>{

}
