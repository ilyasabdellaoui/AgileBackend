package org.sop.agilebackend.services;

import org.sop.agilebackend.models.Admin;
import org.sop.agilebackend.repositories.AdminDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminDao adminDao;

    public Admin findByEmail(String email){
        return adminDao.findByEmail(email);
    }

    public Admin save(Admin admin){
        Admin foundAdmin = findByEmail(admin.getEmail());
        if(foundAdmin!= null) return null;
        return adminDao.save(admin);
    }

    public Admin login(String email,String password){
        Admin foundAdmin = findByEmail(email);
        if(foundAdmin == null) return null;
        else if(!password.equals(foundAdmin.getPassword()))
            return null;
        return foundAdmin;
    }
}
