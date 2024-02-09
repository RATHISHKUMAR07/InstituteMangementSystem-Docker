package com.ims.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ims.entity.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer> {
	
	@Query("SELECT i FROM Institute i WHERE i.university like %:university%")
	List<Institute> getInstituteByUniversity(@Param("university") String university);
	
	@Query("SELECT i FROM Institute i WHERE i.state like %:state%")
	List<Institute> getInstituteByState(@Param("state") String state);
	
	@Query("SELECT i FROM Institute i WHERE i.country like %:country%")
	List<Institute> getInstituteByCountry(@Param("country") String country);
	
	
	@Query("SELECT i FROM Institute i WHERE i.students > :students")
	List<Institute> getInstituteByStudentsCount(@Param("students") int students);
	
	@Query("SELECT i FROM Institute i WHERE i.professors > :professors")
	List<Institute> getInstituteByProfessorsCount(@Param("professors") int professors);
	
	@Query("SELECT i FROM Institute i WHERE i.name LIKE :name%")
	List<Institute> getInstituteByNameSuggest(@Param("name") String name);



	
	
}
