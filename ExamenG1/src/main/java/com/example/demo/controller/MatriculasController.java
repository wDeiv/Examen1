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

import com.example.demo.entity.Cursos;
import com.example.demo.entity.Grados;
import com.example.demo.entity.Matriculas;
import com.example.demo.service.CursosService;
import com.example.demo.service.GradosService;
import com.example.demo.service.MatriculaService;

import jakarta.validation.Valid;
import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/matriculas")
public class MatriculasController {
	@Autowired
	private MatriculaService services;
	
	@GetMapping
	public ResponseEntity<List<Matriculas>> readAll(){
		try {
			List<Matriculas> matricula = services.readAll();
			if (matricula.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(matricula, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Matriculas> crear(@Valid @RequestBody Matriculas al){
		try {
			Matriculas a = services.create(al);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Matriculas> getmatri(@PathVariable("id") Long id){
		try {
			Matriculas a = services.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Matriculas> delmatri(@PathVariable("id") Long id){
		try {
			services.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatematri(@PathVariable("id") Long id, @Valid @RequestBody Matriculas al){
		Optional<Matriculas> a = services.read(id);
		if (a.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} else {
			return new ResponseEntity<>(services.update(al), HttpStatus.OK);
		}
    }
}
