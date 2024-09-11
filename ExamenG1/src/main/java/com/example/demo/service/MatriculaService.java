package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Matriculas;

public interface MatriculaService {
	Matriculas create (Matriculas m);
	Matriculas update (Matriculas m);
	void delete (Long id);
	Optional<Matriculas> read(Long id);
	List<Matriculas> readAll();
}
