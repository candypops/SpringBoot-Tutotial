package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//@Component // custom string bean
@Service // same as component but preferred bc of readability
public class StudentService {

    public List<Student> getStudents(){
        return List.of(
                new Student(1L,
                        "Maria",
                        "Maria.g@mail.com",
                        LocalDate.of(2002, Month.AUGUST, 5),
                        25
                )
        );
    }
}
