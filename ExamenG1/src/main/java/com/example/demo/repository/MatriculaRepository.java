package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Matriculas;

@Repository
public interface MatriculaRepository extends JpaRepository<Matriculas, Long>{

}
