package com.ims.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ims.entity.Institute;
import com.ims.exception.InstituteNotFoundException;
import com.ims.repository.InstituteRepository;

@Service
public class InstituteService implements IInstituteService{
	
	@Autowired
	private InstituteRepository instituteRepository ;
	
	@Override
	public void addInstitute(Institute institute) {
		Optional<Institute> optionalInstitute = instituteRepository.findById(institute.getId());
		if(optionalInstitute.isPresent()) {
			throw new InstituteNotFoundException("Institute Id is already registered " + institute.getId());
		}
		else {
			Institute instituteAdd = new Institute();

			instituteAdd.setId(institute.getId());
			instituteAdd.setName(institute.getName());
			instituteAdd.setEmail(institute.getEmail());
			instituteAdd.setLocation(institute.getLocation());
			instituteAdd.setState(institute.getState());
			instituteAdd.setCountry(institute.getCountry());
			instituteAdd.setContact(institute.getContact());
			instituteAdd.setCode(institute.getCode());
			instituteAdd.setUniversity(institute.getUniversity());
			instituteAdd.setStudents(institute.getStudents());
			instituteAdd.setProfessors(institute.getProfessors());
			instituteAdd.setBranchs(institute.getBranchs());


			instituteRepository.save(instituteAdd);
		}
	}

	@Override
	public List<Institute> getAllInstitutes() {
		List<Institute> optional = instituteRepository.findAll();
		if(optional.isEmpty()) {
			throw new InstituteNotFoundException("No Institute is registered to display ");
		}
		else{
			List<Institute> institute  = new ArrayList<>();
			optional.forEach(institute::add);
			return institute;
		}
	}

	@Override
	public Optional<Institute> getInstituteById(int Id) {
		Optional<Institute> optional = instituteRepository.findById(Id);
		if(!optional.isPresent()) {
			throw new InstituteNotFoundException("Institute with the id is not found in the database " + Id);
		}
		else {
			return instituteRepository.findById(Id);
		}
	}

	@Override
	public void updateInstituteById(Institute updateInstitute, int iId) {
		Optional<Institute> optional = instituteRepository.findById(iId);
		
		if(!optional.isPresent()) {
			throw new InstituteNotFoundException("No institute to update with id "+ iId);
		}
		else {
			Institute existingInstitute = optional.get();
			
			existingInstitute.setId(updateInstitute.getId());
			existingInstitute.setName(updateInstitute.getName());
			existingInstitute.setEmail(updateInstitute.getEmail());
			existingInstitute.setLocation(updateInstitute.getLocation());
			existingInstitute.setState(updateInstitute.getState());
			existingInstitute.setCountry(updateInstitute.getCountry());
			existingInstitute.setContact(updateInstitute.getContact());
			existingInstitute.setCode(updateInstitute.getCode());
			existingInstitute.setUniversity(updateInstitute.getUniversity());
			existingInstitute.setStudents(updateInstitute.getStudents());
			existingInstitute.setProfessors(updateInstitute.getProfessors());
			existingInstitute.setBranchs(updateInstitute.getBranchs());

			
			instituteRepository.save(existingInstitute);
		}
		
	}

	@Override
	public void deleteIntituteById(int id) {
		Optional<Institute> optional = instituteRepository.findById(id);
		if(!optional.isPresent()) {
			throw new InstituteNotFoundException("Institute with the id is not found in the database " + id);
		}
		else {
			instituteRepository.deleteById(id);
		}
	}

	@Override
	public List<Institute> getInstituteByUniversity(String university) {
		List<Institute> optional = instituteRepository.getInstituteByUniversity(university);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("Not institutes found under "+ university);
		}
		else {
			return instituteRepository.getInstituteByUniversity(university);
		}
	}

	@Override
	public List<Institute> getInstituteByState(String state) {
		List<Institute> optional = instituteRepository.getInstituteByState(state);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("Not institutes found under "+state);
		}
		else {
			return instituteRepository.getInstituteByState(state);
		}
	}

	@Override
	public List<Institute> getInstituteByCountry(String country) {
		List<Institute> optional = instituteRepository.getInstituteByCountry(country);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("Not institutes found under "+country);
		}
		else {
			return instituteRepository.getInstituteByCountry(country);
		}
	}

	@Override
	public List<Institute> getInstituteByStudentsCount(int students) {
		List<Institute> optional = instituteRepository.getInstituteByStudentsCount(students);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("No institutes found count greater than 2000 "+students);
		}
		else {
			return instituteRepository.getInstituteByStudentsCount(students);
		}
	}

	@Override
	public List<Institute> getInstituteByProfessorsCount(int professors) {
		List<Institute> optional = instituteRepository.getInstituteByProfessorsCount(professors);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("No institutes found count greater than 200 "+professors);
		}
		else {
			return instituteRepository.getInstituteByProfessorsCount(professors);
		}
	}

	@Override
	public List<Institute> getInstituteByNameSuggest(String name) {
		List<Institute> optional = instituteRepository.getInstituteByNameSuggest(name);
		if(optional.size() == 0) {
			throw new InstituteNotFoundException("Not institutes found under "+name);
		}
		else {
			return instituteRepository.getInstituteByNameSuggest(name);
		}
	}

}
