package com.example.guincho.repository;

import com.example.guincho.model.Guincho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GuinchoRepository extends  JpaRepository<Guincho, Long>{
}
