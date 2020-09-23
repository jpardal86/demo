package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IPersonaDao;
import com.example.demo.model.Persona;

@Service
public class PersonaService implements IPersonaService {

 @Autowired
 private IPersonaDao personaDao;

 @Override
 public List<Persona> getPersonas() {
  return (List<Persona>) personaDao.findAll();
 }
 
 @Override
 public Persona getPersona(Long id){
  return (Persona) personaDao.findById(id).get();
 }

 @Override
 public Long save(Persona persona) {
	personaDao.save(persona);
	return persona.getId();
 }

 @Override
 public boolean delete(Persona persona) {
	personaDao.delete(persona);
	return true;
 }

}