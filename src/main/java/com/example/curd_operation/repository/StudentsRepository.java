package com.example.curd_operation.repository;

import com.example.curd_operation.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentsRepository extends JpaRepository<Students, Integer> {
}
