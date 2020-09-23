package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Departamento;

public interface IDepartamentoService {
	 public List<Departamento> getDepartamentos ();
	 public Departamento getDepartamento (Long id);
}