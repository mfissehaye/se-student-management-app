package com.example.mystudentmgmtapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MyStudentMgmtAppApplication implements CommandLineRunner {

    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(MyStudentMgmtAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        // Create a Transcript
        Transcript transcript = new Transcript("BS Computer Science");

        // Create a Classroom
        Classroom classroom = new Classroom("McLaughlin building", "M105");

        // Create a Student and associate it with Transcript and Classroom
        Student student = new Student("000-61-0001", "Anna", "Smith", LocalDate.of(2019, 5, 24));
        student.setMiddleName("Lynn");
        student.setCgpa(3.45);
        student.setTranscript(transcript);
        student.setClassroom(classroom);

        // Save Student to database
        saveStudent(student);
    }

    // Method to save a student to the database
    private void saveStudent(Student student) {
        studentRepository.save(student);
    }

}
