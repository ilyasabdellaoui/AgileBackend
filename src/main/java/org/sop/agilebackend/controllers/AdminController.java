package org.sop.agilebackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.sop.agilebackend.models.Admin;
import org.sop.agilebackend.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/")
    public Admin save(@RequestBody Admin admin){
        return adminService.save(admin);
    }

    @GetMapping("/{email}/{password}")
    public Admin login(@PathVariable String email,@PathVariable String password){
        return  adminService.login(email,password);
    }
}

