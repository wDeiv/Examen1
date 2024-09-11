package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.example.demo.entity.Grados;

public interface GradosDao {
	Grados create (Grados g);
	Grados update (Grados g);
	void delete (Long id);
	Optional<Grados> read(Long id);
	List<Grados> readAll();
}
