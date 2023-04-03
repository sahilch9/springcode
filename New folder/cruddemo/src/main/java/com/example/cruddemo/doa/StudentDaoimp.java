package com.example.cruddemo.doa;

import com.example.cruddemo.student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.*;
@Repository
public class StudentDaoimp implements StudentDao {
    private EntityManager entityManager;
@Autowired
    public StudentDaoimp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(student theStudent) {
    entityManager.persist(theStudent);

    }
}
