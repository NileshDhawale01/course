package com.springboot.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springboot.hello.pojo.Cources;
import com.springboot.hello.service.ServiceClass;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@Autowired
	private ServiceClass cources;
	//get cources
	@GetMapping("/cources")
	public List<Cources> getCources(){
		return cources.getCources();
	}
	//get one cource
	@GetMapping("/cources/{courseId}")
	public Cources getCource(@PathVariable String courseId) {
		int id=Integer.parseInt(courseId);
		return cources.getCource(id);
	}
	//add cource
	@PostMapping(path="/cources",consumes = "application/json")
	public Cources addCources(@RequestBody Cources cource) {
		return this.cources.addCorce(cource);
	}
	//update
	@PutMapping("/cources")
	public Cources update(@RequestBody Cources cource) {
		return this.cources.update(cource);
	}
	//delete
	@DeleteMapping("/cources/{courceId}")
	public ResponseEntity<HttpStatus> deleteData(@PathVariable  String courceId){
		int id=Integer.parseInt(courceId);
		try {
			this.cources.deleteData(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			
		}
	}
	
}
