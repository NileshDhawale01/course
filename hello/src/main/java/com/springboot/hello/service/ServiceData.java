package com.springboot.hello.service;

import java.util.List;

import com.springboot.hello.pojo.Cources;

public interface ServiceData {

	public List<Cources> getCources();
	public Cources getCource(int courseId);
	public Cources addCorce(Cources cource);
	public Cources update(Cources cource);
	public void deleteData(int id);
}
