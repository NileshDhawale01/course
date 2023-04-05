package com.springboot.hello.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springboot.hello.pojo.Cources;

@Repository
public class RepositoryClass{

	@Autowired
	RepositoryInt repository;
	public List<Cources> getCources() {
		return repository.findAll();
	}
	//geting one cource
	@SuppressWarnings("deprecation")
	public Cources getCource(int courseId) {
		List<Cources> list =repository.findAll();
		for(Cources li :list) {
			if(courseId==li.getId()) {
				return li;
			}
		}
		return null;
	}
	//add cource
	public Cources addCorce(Cources cource) {
		repository.save(cource);
		return cource;
	}
	//update
	public Cources update(Cources cource) {
		return repository.save(cource);
	}
	//delete
	public void deleteData(int id) {
		Cources cource =repository.getOne(id);
		repository.delete(cource);
	}
}
