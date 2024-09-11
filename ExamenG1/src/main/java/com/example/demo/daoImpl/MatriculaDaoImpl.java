package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.MatriculasDao;
import com.example.demo.entity.Matriculas;
import com.example.demo.repository.MatriculaRepository;

@Component
public class MatriculaDaoImpl implements MatriculasDao{
	
	@Autowired
	private MatriculaRepository matriculaRepository;
	@Override
	public Matriculas create(Matriculas m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public Matriculas update(Matriculas m) {
		// TODO Auto-generated method stub
		return matriculaRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculaRepository.deleteById(id);
	}

	@Override
	public Optional<Matriculas> read(Long id) {
		// TODO Auto-generated method stub
		return matriculaRepository.findById(id);
	}

	@Override
	public List<Matriculas> readAll() {
		// TODO Auto-generated method stub
		return matriculaRepository.findAll();
	}

}
