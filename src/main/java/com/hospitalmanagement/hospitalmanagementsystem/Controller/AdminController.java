package com.hospitalmanagement.hospitalmanagementsystem.Controller;

import com.hospitalmanagement.hospitalmanagementsystem.Entity.Admin;
import com.hospitalmanagement.hospitalmanagementsystem.Services.Adminservice;
import com.hospitalmanagement.hospitalmanagementsystem.Services.Imple.ServiceAdmin;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class AdminController {
    private  final Adminservice  adminservice;
    public AdminController(Adminservice adminservice){
        this.adminservice=adminservice;
    }
@PostMapping("/adminsave")

public String saveAdmin(@ModelAttribute("Admin") Admin admin ) {
    // save employee to database
   adminservice.saveAdmin(admin);

    return "redirect:/home";
}


}
