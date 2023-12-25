package com.dummy.compositeKey.repository;

import com.dummy.compositeKey.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
