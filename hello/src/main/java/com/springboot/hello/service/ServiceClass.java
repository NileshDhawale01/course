package com.springboot.hello.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.hello.pojo.Cources;
import com.springboot.hello.repository.RepositoryClass;

@Service
public class ServiceClass implements ServiceData {

	@Autowired
	private RepositoryClass repository;
	@Override
	public List<Cources> getCources() {
		return repository.getCources();
	}
	//get one cource
	public Cources getCource(int courseId) {
		return repository.getCource(courseId);
	}
	//add cource
	public Cources addCorce(Cources cource) {
		return this.repository.addCorce(cource);
	}
	public Cources update(Cources cource) {
		return repository.update(cource);
	}
	public void deleteData(int id) {
		repository.deleteData(id);
	}
	
}
