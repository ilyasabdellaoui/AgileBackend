package org.sop.agilebackend.repositories;

import org.sop.agilebackend.models.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessorDao extends JpaRepository<Professor,Long> {
    Professor findByFirstNameAndLastName(String firstName,String lastName);
    void deleteById(Long id);
}
