package com.ims.service;
import java.util.*;


import com.ims.entity.Institute;
public interface IInstituteService {
	
	public void addInstitute(Institute institute);
	
	public List<Institute> getAllInstitutes();
	
	public Optional<Institute> getInstituteById(int id);
	
	public void updateInstituteById(Institute institute, int id);
	
	public void deleteIntituteById(int iId);
	
	public List<Institute> getInstituteByUniversity(String university);
	
	public List<Institute> getInstituteByState(String state);

	public List<Institute> getInstituteByCountry(String country);
	
	List<Institute> getInstituteByStudentsCount(int students);

	List<Institute> getInstituteByProfessorsCount(int professors);
	
	List<Institute> getInstituteByNameSuggest(String name);
	
}
