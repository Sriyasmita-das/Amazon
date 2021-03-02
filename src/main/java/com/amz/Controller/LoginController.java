package com.amz.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.amz.model.Login;
import com.amz.service.AmzService;

@RestController
public class LoginController {
	@Autowired
	
	AmzService service;
	

	@GetMapping("/Login")
	private List<Login> getAllLogin() 
	{
	return service.getAllLogin();
	}
	
	@PostMapping("/Login")
	private String save(@RequestBody Login e) {
		service.save(e);
		return "Records are updated Successfully";
	}
	@PutMapping("/")
	private Login update(@RequestBody Login e) {
		service.save(e);
		return e;
	}
	
	@DeleteMapping("/Login/{id}")
	private void delete(@PathVariable("id") int id) {
		service.delete(id);

}
}