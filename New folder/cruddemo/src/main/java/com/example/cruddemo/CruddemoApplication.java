package com.example.cruddemo;

import com.example.cruddemo.doa.StudentDao;
import org.hibernate.id.insert.InsertGeneratedIdentifierDelegate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import com.example.cruddemo.student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.*;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {createStudent(studentDao);};
	}

	private void createStudent(StudentDao studentDao) {
		System.out.println("crate new student obj!!!");
		student tempStudent;
		tempStudent = new student("sahil","choudhary","sahil.choudhary@gmail.com");
//saving the student
		System.out.println("saving the student");
		studentDao.save(tempStudent);
		System.out.println("generated id of saved student"+ tempStudent.getId());

	}
}
