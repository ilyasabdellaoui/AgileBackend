package org.sop.agilebackend.models;

import jakarta.persistence.*;

@Entity
@Table(name = "administrators")
public class Admin extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Admin() {
    }

    public Admin(String email,String password) {
        this.setEmail(email);
        this.setPassword(password);
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
