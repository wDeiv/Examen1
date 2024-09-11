package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmpleadosDao;
import com.example.demo.entity.Empleados;
import com.example.demo.service.EmpleadosService;

@Service
public class EmpleadosServiceImpl implements EmpleadosService{
	
	@Autowired
	private EmpleadosDao empleadosDao;
	@Override
	public Empleados create(Empleados e) {
		// TODO Auto-generated method stub
		return empleadosDao.create(e);
	}

	@Override
	public Empleados update(Empleados e) {
		// TODO Auto-generated method stub
		return empleadosDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadosDao.delete(id);
	}

	@Override
	public Optional<Empleados> read(Long id) {
		// TODO Auto-generated method stub
		return empleadosDao.read(id);
	}

	@Override
	public List<Empleados> readAll() {
		// TODO Auto-generated method stub
		return empleadosDao.readAll();
	}

}
