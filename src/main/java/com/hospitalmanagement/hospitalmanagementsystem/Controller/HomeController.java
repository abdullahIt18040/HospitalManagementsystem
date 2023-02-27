package com.hospitalmanagement.hospitalmanagementsystem.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public  String homepage()
    {
        return "welcome.html";
    }

    @GetMapping("/admin-dashbord")
    public  String admindashbord()
    {
        return "dashboad.html";
    }


    @GetMapping("/adminlog")
    public  String adminlog()
    {
        return "login.html";
    }

    @GetMapping("/home1")
    public  String homepage1()
    {

        return "home.html";
    }



    @GetMapping("/logout")
    public  String logout()
    {

        return "welcome.html";
    }


    @GetMapping("/register")
    public  String register()
    {

        return "register.html";
    }



    @GetMapping("/forgotpass")
    public  String forgotpass()
    {

        return "forgot-password.html";
    }

    @GetMapping("/changepass")
    public  String changepass()
    {

        return "changepassword.html";
    }


    @GetMapping("/success")
    public  String successful()
    {

        return "success.html";
    }



    @GetMapping("/alldoctor")
    public  String alldoctor()
    {

        return "alldoctor.html";
    }



    @GetMapping("/alldoclist")
    public  String alldoctorlist()
    {

        return "doctorlist.html";
    }


    @GetMapping("/adddoctor")
    public  String adddoctor()
    {

        return "add_doctor.html";
    }

    @GetMapping("/editdoctor")
    public  String editdoctor()
    {

        return "editdoctor.html";
    }


    @GetMapping("/aboutus")
    public  String About()
    {

        return "about-us.html";
    }


    @GetMapping("/doctor")
    public  String Doctor()
    {

        return "doctor.html";
    }
    @GetMapping("/depertment")
    public  String Depertment()
    {

        return "depertment.html";
    }
    @GetMapping("/contact")
    public  String Contact()
    {

        return "contact.html";
    }

    @GetMapping("/blog")
    public  String Blog()
    {

        return "blog.html";
    }


}
