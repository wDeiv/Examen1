package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CursosDao;
import com.example.demo.entity.Cursos;
import com.example.demo.repository.CursosRepository;

@Component
public class CursosDaoImpl implements CursosDao{
	
	@Autowired
	private CursosRepository cursosRepository;
	@Override
	public Cursos create(Cursos c) {
		// TODO Auto-generated method stub
		return cursosRepository.save(c);
	}

	@Override
	public Cursos update(Cursos c) {
		// TODO Auto-generated method stub
		return cursosRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursosRepository.deleteById(id);
	}

	@Override
	public Optional<Cursos> read(Long id) {
		// TODO Auto-generated method stub
		return cursosRepository.findById(id);
	}

	@Override
	public List<Cursos> readAll() {
		// TODO Auto-generated method stub
		return cursosRepository.findAll();
	}

}
