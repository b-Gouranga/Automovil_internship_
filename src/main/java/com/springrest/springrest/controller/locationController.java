package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Ghat;
import com.springrest.springrest.services.ghatService;

@RestController 
public class locationController {

	@Autowired
	private ghatService ghatservice;
	
	//get ghat 
	@GetMapping("/ghat")
	public List<Ghat> getghat()
	{
		return this.ghatservice.getghat();
		
	}
	
	@PostMapping(path="/ghat",consumes= "application/json")
	public Ghat addGhat(@RequestBody Ghat newghat)
	{
		return this.ghatservice.addGhat(newghat);
	}
	

}
