package com.dummy.compositeKey.service;

import com.dummy.compositeKey.dto.StudentDTO;
import com.dummy.compositeKey.entity.StudentId;

import java.util.List;

public interface StudentServiceImpl {

    List<StudentDTO> getAllStudentDTO();
    StudentDTO getStudentByIdDTO(StudentId studentId);

    void createStudentDTO(StudentDTO studentDTO);
    void updateStudentDTO(StudentId studentId, StudentDTO updatedStudentDTO);
    void deleteStudentDTO(StudentId studentId);

}
