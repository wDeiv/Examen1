package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Cursos;

public interface CursosDao {
	Cursos create (Cursos c);
	Cursos update(Cursos c);
	void delete (Long id);
	Optional<Cursos> read(Long id);
	List<Cursos> readAll();
}
