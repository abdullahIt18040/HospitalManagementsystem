package com.hospitalmanagement.hospitalmanagementsystem.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "Admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "Name")
    private String name;
         private  String Email;

    @Column(name = "Password")
    private String password;
    @Column(name = "Repassword")
    private String  repassword;



    public Admin() {

    }

    public Admin(String name,String email,  String password, String repassword) {
        this.name = name;

        this.password = password;
        this.repassword = repassword;
    }




}
