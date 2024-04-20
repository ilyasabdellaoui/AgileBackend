package org.sop.agilebackend.services;

import org.sop.agilebackend.models.Professor;
import org.sop.agilebackend.repositories.ProfessorDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessorService {
    @Autowired
    private ProfessorDao professorDao;

    private Professor findByFirstNameAndLastName(String firstName, String lastName){
        return professorDao.findByFirstNameAndLastName(firstName,lastName);
    }

    public List<Professor> findAll(){
        return professorDao.findAll();
    }

    //save and update do the same job in our case
    public Professor save(Professor professor){
        Professor foundProfessor = findByFirstNameAndLastName(professor.getFirstName(),professor.getLastName());
        if(foundProfessor != null) return null;
        return professorDao.save(professor);
    }

    @Transactional
    public void deleteById(Long id){
        professorDao.deleteById(id);
    }
}
