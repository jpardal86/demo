package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Persona;

public interface IPersonaService {
	 public List<Persona> getPersonas ();
	 public Persona getPersona (Long id);
	 public Long save(Persona persona);
	 public boolean delete(Persona persona);
}