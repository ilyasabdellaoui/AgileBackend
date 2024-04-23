package org.sop.agilebackend.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.sop.agilebackend.models.Professor;
import org.sop.agilebackend.services.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/professor")
public class ProfessorController {
    @Autowired
    private ProfessorService professorService;

    @GetMapping("/")
    public List<Professor> findAll(){
        return professorService.findAll();
    }

    @PostMapping("/")
    public Professor save(@RequestBody Professor professor){
        return professorService.save(professor);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        professorService.deleteById(id);
    }

}
