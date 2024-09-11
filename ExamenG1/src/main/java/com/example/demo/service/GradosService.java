package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Grados;

public interface GradosService {
	Grados create (Grados g);
	Grados update (Grados g);
	void delete (Long id);
	Optional<Grados> read(Long id);
	List<Grados> readAll();
}
