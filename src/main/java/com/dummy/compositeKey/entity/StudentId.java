package com.dummy.compositeKey.entity;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
public class StudentId implements Serializable {

    private Long id;
    private String course;



}
