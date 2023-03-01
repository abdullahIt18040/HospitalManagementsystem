package com.hospitalmanagement.hospitalmanagementsystem.Services.Imple;

import com.hospitalmanagement.hospitalmanagementsystem.Entity.Admin;
import com.hospitalmanagement.hospitalmanagementsystem.Repository.AdminRepository;
import com.hospitalmanagement.hospitalmanagementsystem.Services.Adminservice;
import org.springframework.stereotype.Service;

@Service
public class ServiceAdmin implements Adminservice {

private final AdminRepository adminRepository;

 public ServiceAdmin(AdminRepository adminRepository)
 {
     this.adminRepository=adminRepository;
 }


    @Override
    public Admin saveAdmin(Admin admin) {
     this.adminRepository.save(admin);

        return admin;
    }


}
