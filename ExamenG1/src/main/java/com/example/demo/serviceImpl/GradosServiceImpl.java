package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.GradosDao;
import com.example.demo.entity.Grados;
import com.example.demo.service.GradosService;
@Service
public class GradosServiceImpl implements GradosService{
	
	@Autowired
	private GradosDao dao;
	@Override
	public Grados create(Grados g) {
		// TODO Auto-generated method stub
		return dao.create(g);
	}

	@Override
	public Grados update(Grados g) {
		// TODO Auto-generated method stub
		return dao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Grados> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Grados> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
