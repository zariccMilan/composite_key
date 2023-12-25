package com.dummy.compositeKey.dto;

import com.dummy.compositeKey.entity.StudentId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

    private String name;
    private StudentId studentId;


}
