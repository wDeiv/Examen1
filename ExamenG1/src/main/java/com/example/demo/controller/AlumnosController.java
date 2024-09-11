package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Alumnos;
import com.example.demo.entity.Empleados;
import com.example.demo.service.AlumnosService;
import com.example.demo.service.EmpleadosService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/alumnos")
public class AlumnosController {
	@Autowired
	private AlumnosService services;
	
	@GetMapping
	public ResponseEntity<List<Alumnos>> readAll(){
		try {
			List<Alumnos> alumnos = services.readAll();
			if (alumnos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(alumnos, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Alumnos> crear(@Valid @RequestBody Alumnos al){
		try {
			Alumnos a = services.create(al);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Alumnos> getAlumnoId(@PathVariable("id") Long id){
		try {
			Alumnos a = services.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Alumnos> delAlumno(@PathVariable("id") Long id){
		try {
			services.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAlumno(@PathVariable("id") Long id, @Valid @RequestBody Alumnos al){
		Optional<Alumnos> a = services.read(id);
		if (a.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} else {
			return new ResponseEntity<>(services.update(al), HttpStatus.OK);
		}
    }
}
