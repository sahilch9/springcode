package com.example.cruddemo.doa;

import com.example.cruddemo.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.*;

public interface StudentDao{

 void save(student theStudent);


}
