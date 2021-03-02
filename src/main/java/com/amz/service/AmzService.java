package com.amz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amz.repository.LoginRepository;
import com.amz.model.Login;

@Service
public class AmzService {

	@Autowired
      LoginRepository repo;
	
	public List<Login> getAllLogin(){
		List<Login> employees=new ArrayList<Login>();
		repo.findAll().forEach(employee->employees.add(employee));
		return employees;
}
	public void save(Login e) {
		repo.save(e);
	}
	public void delete(int id) {
		repo.deleteById(id);
}
}