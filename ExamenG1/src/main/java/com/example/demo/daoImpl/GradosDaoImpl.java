package com.example.demo.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.GradosDao;
import com.example.demo.entity.Grados;
import com.example.demo.repository.GradosRepository;
@Component
public class GradosDaoImpl implements GradosDao{
	
	@Autowired
	private GradosRepository gradosRepository;
	@Override
	public Grados create(Grados g) {
		// TODO Auto-generated method stub
		return gradosRepository.save(g);
	}

	@Override
	public Grados update(Grados g) {
		// TODO Auto-generated method stub
		return gradosRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradosRepository.deleteById(id);
	}

	@Override
	public Optional<Grados> read(Long id) {
		// TODO Auto-generated method stub
		return gradosRepository.findById(id);
	}

	@Override
	public List<Grados> readAll() {
		// TODO Auto-generated method stub
		return gradosRepository.findAll();
	}

}
