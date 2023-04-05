package com.springboot.hello.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.hello.pojo.Cources;

public interface RepositoryInt extends JpaRepository<Cources, Integer>{

	//Cources findOne(int courseId);

//	public List<Cources> getCources();
//	public Cources getCource(int courseId);
//	public Cources addCorce(Cources cource);
//	public Cources update(Cources cource);
//	public void deleteData(int id);
}
