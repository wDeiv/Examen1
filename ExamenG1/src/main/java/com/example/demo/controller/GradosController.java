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
import com.example.demo.entity.Grados;
import com.example.demo.service.AlumnosService;
import com.example.demo.service.EmpleadosService;
import com.example.demo.service.GradosService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/api/grados")
public class GradosController {
	@Autowired
	private GradosService services;
	
	@GetMapping
	public ResponseEntity<List<Grados>> readAll(){
		try {
			List<Grados> grados = services.readAll();
			if (grados.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(grados, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping
	public ResponseEntity<Grados> crear(@Valid @RequestBody Grados al){
		try {
			Grados a = services.create(al);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Grados> getgrados(@PathVariable("id") Long id){
		try {
			Grados a = services.read(id).get();
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Grados> delgrado(@PathVariable("id") Long id){
		try {
			services.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updategrado(@PathVariable("id") Long id, @Valid @RequestBody Grados al){
		Optional<Grados> a = services.read(id);
		if (a.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			
		} else {
			return new ResponseEntity<>(services.update(al), HttpStatus.OK);
		}
    }
}
