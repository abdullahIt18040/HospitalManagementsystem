package com.hospitalmanagement.hospitalmanagementsystem.Repository;

import com.hospitalmanagement.hospitalmanagementsystem.Entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {

}
