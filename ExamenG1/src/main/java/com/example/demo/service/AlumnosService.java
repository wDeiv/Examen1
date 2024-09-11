package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Alumnos;

public interface AlumnosService {
	Alumnos create (Alumnos a);
	Alumnos update(Alumnos a);
	void delete (Long id);
	Optional<Alumnos> read(Long id);
	List<Alumnos> readAll();
}
