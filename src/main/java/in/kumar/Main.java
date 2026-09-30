package in.kumar;

import in.kumar.model.Student;
import in.kumar.repository.StudentRepository;

public class Main {
    public static void main(String[] args) {

        StudentRepository studentRepository =new StudentRepository();

//        studentRepository.createStudent(new Student("Rita","rita@gmail.com",23));

//        studentRepository.updateStudent(new Student("Rohit Kumar","rohitkr@gmail.com",30),5);

//        studentRepository.deleteStudent(6l);

        studentRepository.getStudentById(5l);

        studentRepository.getAllStudent();

    }
}