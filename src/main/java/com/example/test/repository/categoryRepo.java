package com.example.test.repository;

import com.example.test.modal.category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface categoryRepo extends JpaRepository<category,Long> {
}
