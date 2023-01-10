package com.example.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.entity.EmpEntity;
import com.example.repository.EmpRepository;
import com.example.service.EmpService;

@Service
@Component
public class EmpServiceImpl implements EmpService{
		
	@Autowired
	EmpRepository empRepository;
	
	@Override
	public void insert(EmpEntity emp) {
		empRepository.insert(emp);
	}
	
	@Override
	public EmpEntity search(String id) {
		Optional<EmpEntity> opt = empRepository.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}
	
	@Override
	public List<EmpEntity> findAll() {
		List<EmpEntity> list = empRepository.findAll();
		return list;
	};
}
 