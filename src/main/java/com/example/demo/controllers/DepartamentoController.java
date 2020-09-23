package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Departamento;
import com.example.demo.service.IDepartamentoService;

@RestController
public class DepartamentoController {

 @Autowired
 private IDepartamentoService departamentoService;
 
 @RequestMapping("/depth")
 public String index() {
   
  return "Hola. Mi proyecto está publicado";
 }
 
 @GetMapping("/list")
 public List<Departamento> getDepartamentos(){
  return departamentoService.getDepartamentos();
 }
}