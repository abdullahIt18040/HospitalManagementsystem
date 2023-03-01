package com.hospitalmanagement.hospitalmanagementsystem.Controller;

import com.hospitalmanagement.hospitalmanagementsystem.Entity.Admin;
import com.hospitalmanagement.hospitalmanagementsystem.Services.Adminservice;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AdminController {

    private  final Adminservice  adminservice;
    public AdminController(Adminservice adminservice){
        this.adminservice=adminservice;
    }
@PostMapping("/admin")
    public Admin save(Admin admin)
    {
       return adminservice.saveAdmin(admin);
    }


}
