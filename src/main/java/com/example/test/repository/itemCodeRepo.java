package com.example.test.repository;

import com.example.test.modal.itemCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface itemCodeRepo extends JpaRepository<itemCode,Long> {
}
