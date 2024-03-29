package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class StudentService {

    private static final String emailRegex = "^(.+)@(.+)$";
    Pattern pattern = Pattern.compile(emailRegex);

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student){
        Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());

        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email Already in Use");
        }

        studentRepository.save(student);
    }

    public void deleteStudent(Long studentId){
        boolean exists = studentRepository.existsById(studentId);

        if(!exists){
            throw new IllegalStateException(String.format("Student with ID: %s doesn't exit", studentId));
        }

        studentRepository.deleteById(studentId);
    }

    @Transactional
    public void updateStudent(Long studentId, String name, String email) {
        Student student = studentRepository.findById(studentId).orElseThrow(
                ()-> new IllegalStateException(
                        String.format("Student with ID: %s doesn't exit", studentId)
                ));

        if(name != null
                && name.length() > 0
                && !Objects.equals(student.getName(), name)){
            student.setName(name);
        }
        if(email != null
                && email.length() > 0
                && !Objects.equals(student.getEmail(), email)
        ){
            Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);

            if(studentOptional.isPresent()){
                throw new IllegalStateException("Email Already in Use");
            }

            Matcher matcher = pattern.matcher(email);

            if(matcher.matches()) {
                student.setEmail(email);
            }else{
                throw new IllegalStateException("Email is Not Valid");
            }
        }
    }
}
