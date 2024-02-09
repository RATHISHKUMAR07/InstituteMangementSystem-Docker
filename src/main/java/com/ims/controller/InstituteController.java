package com.ims.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ims.entity.Institute;
import com.ims.service.IInstituteService;


@RestController
public class InstituteController {

	@Autowired
	private IInstituteService iInstituteService;
	
	@PostMapping("/Institute")
	public void addInstitute(@RequestBody Institute institute) {
		iInstituteService.addInstitute(institute);
	}
	
	@GetMapping("/Institute")
	public List<Institute> getAllInstitutes(){
		return iInstituteService.getAllInstitutes();
	}
	
	@GetMapping("/Institute/id{id}")
	public Optional<Institute> getInstituteById(@PathVariable int id){
		return iInstituteService.getInstituteById(id);
	}
	
	@PutMapping("/Institute/{id}")
	public void updateInstituteById(@RequestBody Institute institute, @PathVariable int id) {
		iInstituteService.updateInstituteById(institute, id);
	}
	
	@DeleteMapping("/Institute/{id}")
	public void deleteInstituteById(@PathVariable int id) {
		iInstituteService.deleteIntituteById(id);
	}
	
	@GetMapping("/Institute/university{university}")
	public List<Institute> getInstituteByUniversity(@PathVariable String university){
		return iInstituteService.getInstituteByUniversity(university);
	}
	
	@GetMapping("/Institute/state{state}")
	public List<Institute> getInstituteByState(@PathVariable String state){
		return iInstituteService.getInstituteByState(state);
	}
	
	@GetMapping("/Institute/country{country}")
	public List<Institute> getInstituteByCountry(@PathVariable String country){
		return iInstituteService.getInstituteByCountry(country);
	}
	
	@GetMapping("/Institute/students{students}")
	public List<Institute> getInstituteByStudentsCount(@PathVariable int students){
		return iInstituteService.getInstituteByStudentsCount(students);
	}
	
	@GetMapping("/Institute/professors{professors}")
	public List<Institute> getInstituteByProfessorsCount(@PathVariable int professors){
		return iInstituteService.getInstituteByProfessorsCount(professors);
	}
	
	@GetMapping("/Institute/name{name}")
	public List<Institute> getInstituteByNameSuggest(@PathVariable String name){
		return iInstituteService.getInstituteByNameSuggest(name);
	}
	
}
