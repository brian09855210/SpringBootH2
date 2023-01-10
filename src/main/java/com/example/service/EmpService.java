package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.EmpEntity;

@Service
public interface EmpService {

	public void insert(EmpEntity emp);
	public EmpEntity search(String id);
	List<EmpEntity> findAll();

}
