package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Departamento;

public interface IDepartamentoDao extends CrudRepository<Departamento, Long>{}