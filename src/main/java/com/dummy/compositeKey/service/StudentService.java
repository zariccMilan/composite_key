package com.dummy.compositeKey.service;

import com.dummy.compositeKey.dto.StudentDTO;
import com.dummy.compositeKey.entity.Student;
import com.dummy.compositeKey.entity.StudentId;
import com.dummy.compositeKey.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService implements StudentServiceImpl {

    private StudentRepository studentRepository;

    @Override
    public List<StudentDTO> getAllStudentDTO() {
        List<Student> studentDTO = studentRepository.findAll();
        return studentDTO.stream()
                .map(student -> new StudentDTO(
                        student.getName(),
                        student.getStudentId()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentByIdDTO(StudentId studentId) {
        Student student = studentRepository.findById(studentId.getId()).orElse(null);
        return (student != null) ?
                new StudentDTO(
                        student.getName(),
                        student.getStudentId()
                ) : null;
    }

    @Override
    public void createStudentDTO(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        studentRepository.save(student);

    }

    @Override
    public void updateStudentDTO(StudentId studentId, StudentDTO updatedStudentDTO) {
        Student existingStudent = studentRepository.findById(studentId.getId()).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudentDTO.getName());
            studentRepository.save(existingStudent);
        }
    }

    @Override
    public void deleteStudentDTO(StudentId studentId) {
        studentRepository.deleteById(studentId.getId());

    }
}
