package com.dummy.compositeKey.controller;


import com.dummy.compositeKey.dto.StudentDTO;
import com.dummy.compositeKey.entity.StudentId;
import com.dummy.compositeKey.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public ResponseEntity<List<StudentDTO>> getAllStudentDTO() {
        List<StudentDTO> studentDTO = studentService.getAllStudentDTO();
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentByIdDTO(@RequestBody StudentId studentId) {
        StudentDTO studentDTO = studentService.getStudentByIdDTO(studentId);
        return (studentDTO != null) ?
                new ResponseEntity<>(studentDTO, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Void> createStudentDTO(@RequestBody StudentDTO studentDTO) {
        studentService.createStudentDTO(studentDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateStudentDTO(@RequestBody StudentId studentId, @RequestBody StudentDTO updatedStudentDTO) {
        studentService.updateStudentDTO(studentId, updatedStudentDTO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @DeleteMapping
    public ResponseEntity<Void> deleteStudentDTO(StudentId studentId) {
        studentService.deleteStudentDTO(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
