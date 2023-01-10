package com.example.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.entity.EmpEntity;

public interface EmpRepository extends CrudRepository<EmpEntity, String>{
		
		public Optional<EmpEntity> findById(String id);
		public List<EmpEntity> findAll();
		
		@Query(value="insert into employee(name, sex, hiredate) values(?, ?, parsedatetime(current_timestamp(), 'yyyy-MM-dd hh:mm:ss'))", nativeQuery = true)
		public void insert(EmpEntity emp);
}
