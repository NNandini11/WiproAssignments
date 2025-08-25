package com.example.demo.services;

import java.util.List;



import com.example.demo.entities.College;


public interface CollegeService {

public List<College> getAll();

public String save(College c);

}
