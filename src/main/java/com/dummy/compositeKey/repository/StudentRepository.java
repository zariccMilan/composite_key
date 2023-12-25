package com.dummy.compositeKey.repository;

import com.dummy.compositeKey.entity.Student;
import com.dummy.compositeKey.entity.StudentId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, StudentId> {
}
