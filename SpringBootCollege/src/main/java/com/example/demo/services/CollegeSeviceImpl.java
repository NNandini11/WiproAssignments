package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.College;
import com.example.demo.repositories.CollegeRepository;
@Service
public class CollegeSeviceImpl implements CollegeService {
	
	@Autowired
	private CollegeRepository crepo;

	@Override
	public List<College> getAll() {
		return crepo.findAll();

	}

	@Override
	public String save(College c) {
		crepo.save(c);
		return "Object Added";
	}

}
