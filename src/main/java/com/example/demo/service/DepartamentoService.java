package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IDepartamentoDao;
import com.example.demo.model.Departamento;

@Service
public class DepartamentoService implements IDepartamentoService {

 @Autowired
 private IDepartamentoDao departamentoDao;

 @Override
 public List<Departamento> getDepartamentos() {
  return (List<Departamento>) departamentoDao.findAll();
 }
 
 @Override
 public Departamento getDepartamento(Long id){
  return (Departamento) departamentoDao.findById(id).get();
 }

}