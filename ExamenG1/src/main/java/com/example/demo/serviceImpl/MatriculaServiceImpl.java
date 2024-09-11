package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MatriculasDao;
import com.example.demo.entity.Matriculas;
import com.example.demo.service.MatriculaService;
@Service
public class MatriculaServiceImpl implements MatriculaService{
	
	@Autowired
	private MatriculasDao dao;
	@Override
	public Matriculas create(Matriculas m) {
		// TODO Auto-generated method stub
		return dao.create(m);
	}

	@Override
	public Matriculas update(Matriculas m) {
		// TODO Auto-generated method stub
		return dao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Matriculas> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Matriculas> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}
}
