package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Departamento;
import com.example.demo.model.Persona;
import com.example.demo.service.IDepartamentoService;
import com.example.demo.service.IPersonaService;

@RestController
public class PersonaController {

 @Autowired
 private IPersonaService personaService;
 
 @Autowired
 private IDepartamentoService departamentoService;
 
 @RequestMapping("/")
 public String index() {
   
  return "Hola. Mi proyecto está publicado";
 }
 
 @GetMapping("/personas")
 public List<Persona> getPersonas(){
  return personaService.getPersonas();
 }
 
 @GetMapping("/personas/{id}")
 public Persona getPersona(@PathVariable Long id){
  return personaService.getPersona(id);
 }
 
 @RequestMapping(value="/personas", method=RequestMethod.POST)
 public ResponseEntity<String> setPersona(@RequestBody Persona persona) {
	 personaService.save(persona);
	 return new ResponseEntity<String>(String.valueOf(persona.getId()), HttpStatus.OK);
 }
 
 @RequestMapping(value="/personas/{id}", method=RequestMethod.DELETE)
 public ResponseEntity<String> removePersona(@PathVariable Long id) {
	 Persona persona = personaService.getPersona(id);
	 
	 if (persona != null) {
		 personaService.delete(persona);
		 return new ResponseEntity<String>(String.valueOf(id), HttpStatus.OK);
	 } else {
		 return new ResponseEntity<String>(String.valueOf(id), HttpStatus.BAD_REQUEST);
	 }
 }
 
 @GetMapping("/departamentos")
 public List<Departamento> getDepartamentos(){
  return departamentoService.getDepartamentos();
 }
}