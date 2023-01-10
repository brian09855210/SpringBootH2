package com.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmpEntity;
import com.example.service.EmpService;


@RestController
public class EmpController {
	
		Logger logger = LoggerFactory.getLogger(EmpController.class);
		
		@Autowired
		EmpService empService;
	
		@GetMapping("/search")
		public Object search(String id) {
			logger.debug("query#start");
			return empService.search(id);
		}
		
		@GetMapping("/findAll")
		public List<EmpEntity> findAll(){
			return empService.findAll();
		}
		
		@PostMapping("/insert")
		public Object insert(@RequestBody @Validated EmpEntity emp) {
			logger.debug("insert#start");
			empService.insert(emp);
			return "新增成功";
		}
}
