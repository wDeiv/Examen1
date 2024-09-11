package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cursos;

@Repository
public interface CursosRepository extends JpaRepository<Cursos, Long>{

}
