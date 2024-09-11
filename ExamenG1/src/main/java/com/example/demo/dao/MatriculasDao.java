package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Matriculas;

public interface MatriculasDao {
	Matriculas create (Matriculas m);
	Matriculas update (Matriculas m);
	void delete (Long id);
	Optional<Matriculas> read(Long id);
	List<Matriculas> readAll();
}
