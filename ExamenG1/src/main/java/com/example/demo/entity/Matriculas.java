package com.example.demo.entity;

import java.sql.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="matriculas")
public class Matriculas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	@Column(name="horas")
	private String horas;
	@Column(name="nivel")
	private String nivel;
	
	
	@ManyToOne
	@JoinColumn(name="alumno_id", nullable = false)
	private Alumnos alumnos;
	
	@ManyToOne
	@JoinColumn(name="grado_id", nullable = false)
	private Grados grados;
	
	@ManyToOne
	@JoinColumn(name="empleado_id", nullable = false)
	private Empleados empleados;
}
