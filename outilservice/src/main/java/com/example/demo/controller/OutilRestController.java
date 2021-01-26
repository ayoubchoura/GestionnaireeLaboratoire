package com.example.demo.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Outil;
import com.example.demo.service.OutilService;

@RestController
public class OutilRestController {
	@Autowired
	OutilService outilService;

	@RequestMapping(value = "/outils", method = RequestMethod.GET)
	public List<Outil> findMembres() {
		return outilService.findAll();
	}
	
	@GetMapping(value = "/outils/description")
	public Outil findOutilByDesc(
		@RequestParam	String description) {
		return outilService.findBySource(description);
	}
	
	@GetMapping(value = "/outils/{id}")
	public Outil findOutil(@PathVariable Long id) {
		return outilService.findOutil(id); 
	}
	@PostMapping("/outils")
	public Outil addOutil(@RequestBody Outil o) {
		return outilService.addOutil(o); 
	}
	@PutMapping("outils/{id}")
	public Outil updateOUtil(@PathVariable Long id,@RequestBody Outil o) {
		o.setId(id);
		return outilService.updateOutil(o);
		
	}
	@DeleteMapping(value="/outils/{id}")
	public void deletetool(@PathVariable Long id) {
		outilService.deleteById(id);
	}

}
